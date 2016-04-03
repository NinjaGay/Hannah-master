package br.edu;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;
import br.edu.states.MenuState;

public class Game extends ApplicationAdapter {
    public static final int SCREEN_HEIGHT = 720;
    public static final int SCREEN_WIDTH = 1280;

    private GameStateManager manager;
    private SpriteBatch batch;    

	@Override
	public void create () {
        batch = new SpriteBatch();
        manager = new GameStateManager();       
        Gdx.gl.glClearColor(0f, 0f, 0f, 1);
        
        
        manager.push(new MenuState(manager));
    }

	@Override
	public void render () {
        
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        manager.update(Gdx.graphics.getDeltaTime());
        manager.render(batch);
	}

    @Override
    public void dispose() {
        batch.dispose();
    }
}
