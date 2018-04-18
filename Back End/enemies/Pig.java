package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import general.Grid;
public class Pig extends Tank{
	public Pig(Grid grid) throws IOException{
		super(grid);
		setGridVal(-3);
		setName("Pig_");
		//setImage(ImageIO.read(new File("pics/Pig.jfif")));
	}
}