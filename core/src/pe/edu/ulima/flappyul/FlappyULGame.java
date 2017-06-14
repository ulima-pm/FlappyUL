package pe.edu.ulima.flappyul;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pe.edu.ulima.flappyul.states.GameStateManager;
import pe.edu.ulima.flappyul.states.MenuState;

public class FlappyULGame extends ApplicationAdapter {
	public static final int GAME_WIDTH = 480;
	public static final int GAME_HEIGHT = 800;

	private SpriteBatch batch;
    private GameStateManager mGSM;

	@Override
	public void create () {
		batch = new SpriteBatch();
        mGSM = new GameStateManager();
        mGSM.push(new MenuState(mGSM));
        Gdx.gl.glClearColor(1, 0, 0, 1);
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        mGSM.update(Gdx.graphics.getDeltaTime());
        mGSM.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
