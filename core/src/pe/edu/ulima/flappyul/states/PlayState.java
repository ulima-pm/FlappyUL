package pe.edu.ulima.flappyul.states;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlayState extends GameState{
    private Texture mTextBackgroud;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        mTextBackgroud = new Texture("bg.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(mCam.combined);
        sb.begin();
        sb.draw(mTextBackgroud, 0, 0, mCam.viewportWidth, mCam.viewportHeight);
        sb.end();
    }

    @Override
    public void dispose() {
        mTextBackgroud.dispose();
    }
}
