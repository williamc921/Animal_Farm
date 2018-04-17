package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Sheep extends Regular{
	public Sheep() throws IOException{
		setGridVal(-1);
		//setImage(ImageIO.read(new File("pics/Sheep.png")));
	}
}