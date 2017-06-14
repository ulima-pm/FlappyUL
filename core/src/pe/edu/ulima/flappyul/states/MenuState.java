package pe.edu.ulima.flappyul.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuState extends GameState{
    private Texture mTexBackground;
    private Texture mTextBoton;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        mTexBackground = new Texture("bg.png");
        mTextBoton = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()){
            mGSM.set(new PlayState(mGSM));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(mCam.combined);
        sb.begin();
        sb.draw(mTexBackground, 0, 0, mCam.viewportWidth, mCam.viewportHeight);
        sb.draw(mTextBoton,
                mCam.position.x - (mTextBoton.getWidth()/2),
                mCam.position.y - (mTextBoton.getHeight() / 2));
        sb.end();
    }

    @Override
    public void dispose() {
        mTexBackground.dispose();
    }
}
