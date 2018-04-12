package enemies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Cow extends Tank{
	public Cow() throws IOException{
		setGridVal(-3);
		setImage(ImageIO.read(new File("pics/Cow.png")));
	}
}