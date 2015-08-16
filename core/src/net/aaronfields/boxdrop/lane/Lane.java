package net.aaronfields.boxdrop.lane;

import java.util.ArrayList;

import net.aaronfields.boxdrop.box.Box;

public class Lane
{
	/**
	 * The boxes in the lane
	 */
	private ArrayList<Box> boxes;
	
	/**
	 * The lane step size and direction
	 */
	private int LANE_STEP = 1;
	
	public boolean add(Box box)
	{
		return boxes.add(box);
	}
	
	public boolean remove(Box box)
	{
		return boxes.remove(box);
	}
	
	public int size()
	{
		return boxes.size();
	}
	
	public void refresh()
	{
		for (Box box : boxes)
		{
			int y = box.getY();
			y += LANE_STEP;
			box.setY(y);
		}
	}

	public void draw()
	{
		for (Box box : boxes)
		{
			box.draw();
		}
	}
}
