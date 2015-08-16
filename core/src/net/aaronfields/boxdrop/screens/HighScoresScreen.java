package net.aaronfields.boxdrop.screens;

import net.aaronfields.boxdrop.BoxDrop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HighScoresScreen extends ScreenAdapter
{
	private BoxDrop game;
	
	public HighScoresScreen(BoxDrop game)
	{
		this.game = game;
	}
	
	@Override
	public void render(float delta)
	{
		GL20 gl = Gdx.gl;
		gl.glClearColor(1, 1, 1, 1);
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		SpriteBatch batch = game.batch;
		batch.begin();
		//batch.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation);
		batch.end();
	}
}
