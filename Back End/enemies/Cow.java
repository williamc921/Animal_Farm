package enemies;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cow extends Tank{
	public Cow(){
		setGridVal(-3);
		try {
			setImage(ImageIO.read(new File("pics/Cow.png")));
		} catch (IOException e) {}
	}
}