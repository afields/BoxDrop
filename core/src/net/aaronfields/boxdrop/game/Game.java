package net.aaronfields.boxdrop.game;

import java.util.ArrayList;

import net.aaronfields.boxdrop.lane.Lane;

public class Game
{
	/**
	 * Time between boxes
	 */
	public static int TIME_BETWEEN_BOXES = 4;
	
	/**
	 * The lanes
	 */
	private static ArrayList<Lane> lanes;

	/**
	 * Reset the game
	 */
	public static void reset()
	{
		lanes = new ArrayList<Lane>();
		for (int i = 0; i < getNumberOfLanes(); i++)
		{
			Lane lane = new Lane();
			lanes.add(lane);
		}
	}
	
	public static void refresh()
	{
		for (Lane lane : lanes)
		{
			lane.refresh();
		}
	}
	
	public static void draw()
	{
		for (Lane lane : lanes)
		{
			lane.draw();
		}
	}
	
	/**
	 * Get the number of lanes
	 */
	private static int getNumberOfLanes()
	{
		return 5;
	}
}
