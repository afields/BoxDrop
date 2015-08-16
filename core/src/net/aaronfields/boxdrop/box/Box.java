package net.aaronfields.boxdrop.box;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Box
{
	/**
	 * Box colors
	 */
	public static final int BLUE 	= 0;
	public static final int GREEN 	= 1;
	public static final int YELLOW 	= 2;
	public static final int RED 	= 3;
	public static final int PURPLE 	= 4;
	
	/**
	 * RGBA Box colors
	 */
	private static final int[] RGBA_BLUE 	= {0, 0, 255};
	private static final int[] RGBA_GREEN 	= {0, 255, 0};
	private static final int[] RGBA_YELLOW 	= {255, 255, 0};
	private static final int[] RGBA_RED 	= {255, 0, 0};
	private static final int[] RGBA_PURPLE 	= {187, 0, 255};
	
	/**
	 * Box sizes
	 */
	public static final int WIDTH 	= 50;
	public static final int HEIGHT 	= 50;
	
	/**
	 * Box color
	 */
	private int color = 0;
	
	/**
	 * The shape renderer
	 */
	private ShapeRenderer shapeRenderer;
	
	/**
	 * The boxes x-coordinate
	 */
	private int x = 0;

	/**
	 * The boxes y-coordinate
	 */
	private int y = 0;
	
	/**
	 * @return the x
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y)
	{
		this.y = y;
	}

	/**
	 * @return the color
	 */
	public int getColor()
	{
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color)
	{
		if (color >= BLUE && color <= PURPLE)
			this.color = color;
	}
	
	/** 
	 * @return true if the boxes are the same, false if not
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Box))
			return false;
		
		if (obj == this)
			return true;
		
		Box box = (Box) obj;
		
		if (color != box.getColor())
			return false;
		
		if (x != box.getX())
			return false;
		
		if (y != box.getY())
			return false;
		
		return true;
	}
	
	/**
	 * Draws the box
	 */
	public void draw()
	{
		if (shapeRenderer == null)
		{
			shapeRenderer = new ShapeRenderer();
		}
		
		shapeRenderer.begin(ShapeType.Filled);
		
		switch (color)
		{
			case BLUE:
				shapeRenderer.setColor(RGBA_BLUE[0], RGBA_BLUE[1], RGBA_BLUE[2], 1);
				break;
			case GREEN:
				shapeRenderer.setColor(RGBA_GREEN[0], RGBA_GREEN[1], RGBA_GREEN[2], 1);
				break;
			case YELLOW:
				shapeRenderer.setColor(RGBA_YELLOW[0], RGBA_YELLOW[1], RGBA_YELLOW[2], 1);
				break;
			case RED:
				shapeRenderer.setColor(RGBA_RED[0], RGBA_RED[1], RGBA_RED[2], 1);
				break;
			case PURPLE:
				shapeRenderer.setColor(RGBA_PURPLE[0], RGBA_PURPLE[1], RGBA_PURPLE[2], 1);
				break;
		}
		
		shapeRenderer.rect(x, y, WIDTH, HEIGHT);
		shapeRenderer.end();
	}
}

