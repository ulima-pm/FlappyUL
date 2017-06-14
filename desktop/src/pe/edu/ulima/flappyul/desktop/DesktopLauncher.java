package pe.edu.ulima.flappyul.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pe.edu.ulima.flappyul.FlappyULGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyULGame.GAME_WIDTH;
		config.height = FlappyULGame.GAME_HEIGHT;
		config.title = "Flappy Universidad de Lima";
		new LwjglApplication(new FlappyULGame(), config);
	}
}
