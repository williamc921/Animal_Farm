package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import general.Grid;
public class Chicken extends Fast{
	public Chicken(Grid grid) throws IOException{
		super(grid);
		setName("Chic");
		setGridVal(-2);
		//setImage(ImageIO.read(new File("pics/Chicken.png")));
	}
}
