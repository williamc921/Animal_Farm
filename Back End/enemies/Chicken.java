package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Chicken extends Fast{
	public Chicken() throws IOException{
		setGridVal(-2);
		//setImage(ImageIO.read(new File("pics/Chicken.png")));
	}
}
