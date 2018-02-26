package gebulot.gametutorial1.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Luixmartin on 26/2/18.
 */

public class Game {

    Nave nave;
    public Game(){
        nave= new Nave();

    }

    public void pintar(SpriteBatch batch){
        nave.pintar(batch);
    }

}
