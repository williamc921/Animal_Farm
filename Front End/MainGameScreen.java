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
		this.setLayout(null);
		
		try{
			backg= ImageIO.read(new File("pics/Newest Grass Image.png"));
		}catch(Exception E){}
	}
	
	public void paint(Graphics g){
		g.drawImage(backg, 0, 0, 1600, 900, null);
		for(int i=0;i<this.getComponentCount();i++){
			g.translate(this.getComponent(i).getX(), this.getComponent(i).getY());
			this.getComponent(i).paint(g);
			g.translate(-this.getComponent(i).getX(), -this.getComponent(i).getY());
		}
	}
	
	
	
	
}
