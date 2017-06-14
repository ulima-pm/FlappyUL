package pe.edu.ulima.flappyul.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pe.edu.ulima.flappyul.FlappyULGame;

public abstract class GameState {
    protected OrthographicCamera mCam;
    protected GameStateManager mGSM;

    public GameState(GameStateManager gsm){
        mGSM = gsm;
        mCam = new OrthographicCamera();
        mCam.setToOrtho(false,
                FlappyULGame.GAME_WIDTH / 2,
                FlappyULGame.GAME_HEIGHT / 2);
    }

    public abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
}
