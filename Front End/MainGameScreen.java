import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainGameScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	JButton exit = new JButton("Exit");
	BufferedImage backg;
	
	MainGameScreen() {
		try{
			backg= ImageIO.read(new File("pics/Background Image.jpg"));
		}catch(Exception E){}
	}
	
	
	
	
}
