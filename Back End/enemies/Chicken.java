package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import general.Game;
import general.Grid;
public class Chicken extends Fast{
	public Chicken() throws IOException{
		super();
		setName("Chic");
		setGridVal(-2);
		//setImage(ImageIO.read(new File("pics/Chicken.png")));
	}
}
