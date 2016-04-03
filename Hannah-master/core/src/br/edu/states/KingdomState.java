package br.edu.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import br.edu.GameStateManager;

public abstract class KingdomState extends State{

    protected KingdomState(GameStateManager stateManager) {
        super(stateManager);
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void render(SpriteBatch batch) {

    }

    @Override
    public void dispose() {

    }
}
