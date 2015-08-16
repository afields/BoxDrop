package net.aaronfields.boxdrop;

import net.aaronfields.boxdrop.box.Box;
import net.aaronfields.boxdrop.game.Game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

public class BoxDrop extends ApplicationAdapter
{
	SpriteBatch batch;
	
	private boolean _initialized = false;
	
	@Override
	public void create()
	{
		batch = new SpriteBatch();
	}
	
	public void init()
	{
		_initialized = true;
		
		Game.reset();
		
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
		
	}

	@Override
	public void render()
	{
		if (!_initialized)
			init();
		
		//Game.refresh();
		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//Game.draw();
		batch.end();
	}
}
