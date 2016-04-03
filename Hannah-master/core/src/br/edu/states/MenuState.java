package br.edu.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import br.edu.Game;
import br.edu.GameStateManager;
import br.edu.kingdoms.KingdomOne;

public class MenuState extends State {
    private Texture bg, playBtn;

    public MenuState(GameStateManager stateManager) {
        super(stateManager);
        bg = new Texture("placeholder.png");
        playBtn = new Texture("placeholder.png");
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            manager.set(new KingdomOne(manager));
            dispose();
        }
    }

    @Override
    public void update(float deltaTime) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch batch) {
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(bg, 0, 0, Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);
        batch.draw(playBtn, (Game.SCREEN_WIDTH / 2) - 150, (Game.SCREEN_HEIGHT / 2) - 150, 300, 300);
        batch.end();
    }

    @Override
    public void dispose() {
        bg.dispose();
        playBtn.dispose();
    }
}
