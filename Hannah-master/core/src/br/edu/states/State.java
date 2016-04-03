package br.edu.states;

import static br.edu.Game.SCREEN_HEIGHT;
import static br.edu.Game.SCREEN_WIDTH;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import br.edu.GameStateManager;

public abstract class State {
    protected OrthographicCamera camera;
    protected GameStateManager manager;

    protected State (GameStateManager stateManager) {
        manager = stateManager;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, SCREEN_WIDTH, SCREEN_HEIGHT);
    }
    
    

    public abstract void handleInput();
    public abstract void update(float deltaTime);
    public abstract void render(SpriteBatch batch);
    public abstract void dispose();
}
