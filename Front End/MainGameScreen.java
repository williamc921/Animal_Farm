import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.JButton;

public class MainGameScreen extends JPanel {
	JButton exit = new JButton("Exit");
	BufferedImage backg;
	private JLabel[] towerLabels = new JLabel[6];
	
	MainGameScreen(JButton[] chosenTowers) {
		this.setLayout(null);

			
		try{
			backg= ImageIO.read(new File("pics/Grass.png"));
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
