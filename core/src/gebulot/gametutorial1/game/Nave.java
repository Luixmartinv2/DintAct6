package gebulot.gametutorial1.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Luixmartin on 26/2/18.
 */

public class Nave {

    Texture img;

    int x = 50;
    int y = 50;

    public Nave(){
        img = new Texture("Nave.png");

    }

    public void pintar(SpriteBatch batch){
        batch.draw(img,x,y);

    }

}
