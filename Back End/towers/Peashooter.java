package towers;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Peashooter extends Tower{
	public Peashooter() throws IOException{
		//setImage(ImageIO.read(new File("pics/Peashooter.jfif")));
		setName("Psht");
		setHealth(10);
		setDamage(10);
		setGridVal(1);
		setPrice(10);
	}
}