package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import general.Game;
import general.Grid;
public class Pig extends Tank{
	public Pig(Game game) throws IOException{
		super(game);
		setGridVal(-3);
		setName("Pig_");
		//setImage(ImageIO.read(new File("pics/Pig.jfif")));
	}
}