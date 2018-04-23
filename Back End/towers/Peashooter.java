package towers;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import general.Game;
public class Peashooter extends Tower{
	public Peashooter(Game newGame) throws IOException{
		//setImage(ImageIO.read(new File("pics/Peashooter.jfif")));
		super(newGame);
		setName("Psht");
		setHealth(100);
		setDamage(10);
		setGridVal(1);
		setPrice(10);
	}
}