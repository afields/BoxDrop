package net.aaronfields.boxdrop.settings;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Settings
{
	private static String SAVE_FILE = ".boxdrop";
	private static String SAVE_FILE_SEPARATOR = "f5ff815dcd3cfe71ccbac8f07fd2d849";
	
	private static LinkedList<HighScorePlayer> highScores;
	
	public static void load()
	{
		try
		{
			FileHandle fh = Gdx.files.external(SAVE_FILE);
			String[] tokens = fh.readString().split(SAVE_FILE_SEPARATOR);
			int ndx = 0;
			
			int numHighScores = Integer.parseInt(tokens[ndx++]);
			for (int i = ndx; i < ndx + (2*numHighScores); i += 2)
			{
				HighScorePlayer player = new HighScorePlayer();
				player.name = tokens[i];
				player.score = Integer.parseInt(tokens[i+1]);
				
				for (int j = 0; j < highScores.size(); j++)
				{
					HighScorePlayer checkPlayer = highScores.get(j);
					if (player.score > checkPlayer.score)
						highScores.add(j, player);
				}
			}
		}
		catch (Throwable t)
		{
			// defaults
		}
	}
	
	public static void save()
	{
		try
		{
			FileHandle fh = Gdx.files.external(SAVE_FILE);
			fh.writeString(Integer.toString(highScores.size()), false);
			fh.writeString(SAVE_FILE_SEPARATOR, true);
			
			for (HighScorePlayer player : highScores)
			{
				fh.writeString(player.name, true);
				fh.writeString(SAVE_FILE_SEPARATOR, true);
				fh.writeString(Integer.toString(player.score), true);
				fh.writeString(SAVE_FILE_SEPARATOR, true);
			}
		}
		catch (Throwable t)
		{
			
		}
	}
	
	/**
	 * @return the highScores
	 */
	public static LinkedList<HighScorePlayer> getHighScores()
	{
		return highScores;
	}

	/**
	 * A player with a high score
	 */
	public static class HighScorePlayer
	{
		public String name = "";
		public Integer score = 0;
	}
}
