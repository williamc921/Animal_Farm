package towers;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import general.Game;
public class Peashooter extends Tower{
	public Peashooter() throws IOException{
		//setImage(ImageIO.read(new File("pics/Peashooter.jfif")));
		super();
		setName("Psht");
		setHealth(100);
		setDamage(20);
		setGridVal(1);
		setPrice(10);
		setSpeed(1000);
		speed.start();
	}
}