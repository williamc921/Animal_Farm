package enemies.Tank;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import general.Grid;
public class Cow extends Tank{
	public Cow() throws IOException{
		setName("Cow_");
		setGridVal(-3);
		setImage(ImageIO.read(new File("pics/Cow.png")));
	}
}