package br.edu.kingdoms;

import br.edu.Game;
import br.edu.GameStateManager;
import br.edu.chars.Hannah;
import br.edu.states.KingdomState;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class KingdomOne extends KingdomState{
    
    private Texture kingdomBg;
    Hannah hannah = new Hannah();
    
    public KingdomOne(GameStateManager stateManager) {
        super(stateManager);
        kingdomBg = new Texture("kingdomBg.png");
        
    }
        
    
    @Override
    public void handleInput() {        
    }

    @Override
    public void update(float deltaTime) {
        hannah.handleInput();
    }

    @Override
    public void render(SpriteBatch batch) {
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(kingdomBg, 450, 220, 400, 300);
        batch.draw(hannah.getHannahSprite(), hannah.getX(), hannah.getY(), 34, 60);
        batch.end();
        
    }

    @Override
    public void dispose() {

    }
    
}

