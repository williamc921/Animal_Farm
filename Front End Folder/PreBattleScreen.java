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

public class PreBattleScreen extends JPanel implements ActionListener {

	int towersSelected = 0;
	private JButton start = new JButton("Start"), exit = new JButton("Back");
	private JButton[] buttons = new JButton[] {start, exit};
	BufferedImage backg;
	
	PreBattleScreen() {
		this.setLayout(null);
		
		JLabel Title = new JLabel("Pre-Battle");
		Title.setFont(new Font("Times New Roman",1,100));
		Title.setSize(650, 75);
		Title.setLocation(800 - 200 , 50);
		this.add(Title);
		
		for(int i = 0; i < buttons.length; i ++) {
			buttons[i].addActionListener(this);
			buttons[i].setActionCommand(buttons[i].getText());
			buttons[i].setSize(100 , 50);
			buttons[i].setLocation((int) (800 + 200 * (i -.5)) - 50, 760);
			this.add(buttons[i]);
		}
		try{
			backg= ImageIO.read(new File("Pix/TowerDefense Background.jpg"));
		}catch(Exception E){}
		
	
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Start")) {
			MainGameScreen screen = new MainGameScreen();
			TowerDefense.towerdefense.add(screen);
			TowerDefense.towerdefense.remove(0);
			TowerDefense.towerdefense.dispose();
			JFrame f = new JFrame();
			f.add(screen);
			TowerDefense.towerdefense = f;
			TowerDefense.towerdefense.setTitle("TowerDefense");
			TowerDefense.towerdefense.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			TowerDefense.towerdefense.dispose();
			TowerDefense.towerdefense.setUndecorated(true);
			TowerDefense.towerdefense.setExtendedState(JFrame.MAXIMIZED_BOTH);
			TowerDefense.towerdefense.setVisible(true);
			TowerDefense.towerdefense.repaint();
		} else {
			MainMenu screen = new MainMenu();
			TowerDefense.towerdefense.add(screen);
			TowerDefense.towerdefense.remove(0);
			TowerDefense.towerdefense.dispose();
			JFrame f = new JFrame();
			f.add(screen);
			TowerDefense.towerdefense = f;
			TowerDefense.towerdefense.setTitle("TowerDefense");
			TowerDefense.towerdefense.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			TowerDefense.towerdefense.dispose();
			TowerDefense.towerdefense.setUndecorated(true);
			TowerDefense.towerdefense.setExtendedState(JFrame.MAXIMIZED_BOTH);
			TowerDefense.towerdefense.setVisible(true);
			TowerDefense.towerdefense.repaint();
		}
		
	}

}
