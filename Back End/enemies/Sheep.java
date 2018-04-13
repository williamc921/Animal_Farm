package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import general.Grid;
public class Sheep extends Regular{
	public Sheep(Grid newGrid) throws IOException{
		super(newGrid);
		setGridVal(-1);
		setImage(ImageIO.read(new File("pics/Sheep.png")));
	}
}