package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import general.Grid;
public class Pig extends Tank{
	public Pig() throws IOException{
		setGridVal(-3);
		setImage(ImageIO.read(new File("pics/Pig.jfif")));
	}
}