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

import general.Game;
import general.Player;
import towers.Tower;

import javax.swing.JButton;

public class MainGameScreen extends JPanel {
	JButton exit = new JButton("Exit");
	BufferedImage backg;
	private JLabel[] towerLabels = new JLabel[6];
	Game currentGame;
	Player player; 
	BufferedImage image; 
	
	MainGameScreen(Game game) {
		this.setLayout(null);
		
		currentGame = game;

		player = currentGame.getPlayer();
		
		
		Tower tower = player.getTower(0);
		image = tower.getImage();
			
		try{
			image = ImageIO.read(new File("pics/Tower/Peashooter.jfif"));
		}catch(Exception E){}
		
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
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(6,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
		g2d.drawLine(5, 100, 1250, 100);
		g2d.drawLine(5, 30, 1250, 30);
		int increment = 0;
		for(int i = 0; i < 12; i++){
			if(i==0){
				g.setColor(Color.RED);
			}else{
				g.setColor(Color.black);
			}
			g2d.drawLine(100 + increment, 20, 100 + increment, 110);

			increment += 100;
		}
	}
	
	
	
	
}
