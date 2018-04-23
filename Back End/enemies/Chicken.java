package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import general.Game;
import general.Grid;
public class Chicken extends Fast{
	public Chicken(Game game) throws IOException{
		super(game);
		setName("Chic");
		setGridVal(-2);
		//setImage(ImageIO.read(new File("pics/Chicken.png")));
	}
}
