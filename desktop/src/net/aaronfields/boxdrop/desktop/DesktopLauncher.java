package net.aaronfields.boxdrop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.aaronfields.boxdrop.BoxDrop;

public class DesktopLauncher {
	
	private static int WINDOW_WIDTH = 640;
	private static int WINDOW_HEIGHT = 480;
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = WINDOW_WIDTH;
		config.height = WINDOW_HEIGHT;
		new LwjglApplication(new BoxDrop(), config);
	}
}
