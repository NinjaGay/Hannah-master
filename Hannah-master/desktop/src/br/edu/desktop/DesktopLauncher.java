package br.edu.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import br.edu.Game;
import br.edu.chars.Hannah;

public class DesktopLauncher {
	public static void main (String[] arg) {
                
                
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.backgroundFPS = -1;                
		config.foregroundFPS = 30;
		config.height = Game.SCREEN_HEIGHT;
		config.resizable = false;
		config.width = Game.SCREEN_WIDTH;               
		new LwjglApplication(new Game(), config);
                
	}
}
