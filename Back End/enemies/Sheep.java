package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Timer;

import general.Game;
import general.Grid;
public class Sheep extends Regular{
	public Sheep() throws IOException{
		super();
		setGridVal(-1);
		setName("Shep");
		//setImage(ImageIO.read(new File("pics/Sheep.png")));
	}
}