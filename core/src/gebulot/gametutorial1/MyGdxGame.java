package gebulot.gametutorial1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
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
