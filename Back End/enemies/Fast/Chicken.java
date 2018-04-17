package enemies.Fast;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Chicken extends Fast{
	public Chicken() throws IOException{
		setName("Chic");
		setGridVal(-2);
		//setImage(ImageIO.read(new File("pics/Chicken.png")));
	}
}
