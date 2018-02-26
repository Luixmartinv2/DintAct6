package gebulot.gametutorial1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import gebulot.gametutorial1.game.Game;
import gebulot.gametutorial1.game.Nave;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	Game game;

	int iEstado
	int iEstadoMenu =1
	int iEstadoJuego =0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		game = new Game();
	}
//pita
	@Override
	public void render () {
		//limpiado de pantalla floats
		Gdx.gl.glClearColor(1, 0, 0, 1);
		//tipo de bufer
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//le comunican a los sprits que comiencen el pintado
		batch.begin();
		// para controlar el pintado
		batch.draw(img, 0, 0);
		game.pintar(batch);
		//terminar
		batch.end();
	}
	//limpia la memoria
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
