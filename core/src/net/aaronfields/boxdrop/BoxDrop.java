package net.aaronfields.boxdrop;

import net.aaronfields.boxdrop.assets.Assets;
import net.aaronfields.boxdrop.screens.MainMenuScreen;
import net.aaronfields.boxdrop.settings.Settings;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BoxDrop extends Game
{
	public SpriteBatch batch;
	
	/*
	 
		Timer.schedule
		(
			new Task()
			{
				@Override
				public void run()
				{
					// Drop a new box
					System.out.println("Dropping a new box");
				}
				
			},
			0, 
			Game.TIME_BETWEEN_BOXES
		);
		
		
		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//Game.draw();
		batch.end();
	  
	 */
	
	@Override
	public void create()
	{
		batch = new SpriteBatch();
		Settings.load();
		Assets.load();
		setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render()
	{
		super.render();
	}
}
