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
	JButton[] towers = new JButton[8];
	JLabel[] towerNames = new JLabel[8];
	Color[] colors = new Color[] {Color.red, Color.white, Color.black, Color.blue, Color.green, Color.yellow, Color.pink, Color.cyan};	
	int[] chosenTowers = new int[6];
	JButton[] chosenTowersButtons = new JButton[4];
	
	PreBattleScreen() {
		this.setLayout(null);
		
		JLabel Title = new JLabel("Pre-Battle");
		Title.setFont(new Font("Castellar",1, 100));
		Title.setSize(800, 100);
		Title.setLocation(800 - 350 , 70);
		this.add(Title);
		
		for(int i = 0; i < buttons.length; i ++) {
			buttons[i].addActionListener(this);
			buttons[i].setActionCommand(buttons[i].getText());
			buttons[i].setSize(100 , 50);
			buttons[i].setLocation((int) (800 + 200 * (i -.5)) - 50, 760);
			this.add(buttons[i]);
		}
		
		for(int i = 0; i < towerNames.length; i ++) {
			towerNames[i] = new JLabel("Tower " + (1+i));
			towerNames[i].setSize(100,100);
			towerNames[i].setFont(new Font("Castellar", 1 , 10));
			towerNames[i].setForeground(Color.white);
			towerNames[i].setLocation((int) (400 + 200 * (i -.5)) - 225 , 350);
			this.add(towerNames[i]);
		}
		
		for(int i = 0; i < towers.length; i++ ) {
			towers[i] = new JButton();
			towers[i].setBackground(colors[i]);
			towers[i].setSize(100,100);
			towers[i].setLocation((int) (400 + 200 * (i -.5)) - 250 , 250);
			towers[i].addActionListener(this);
			towers[i].setActionCommand(towerNames[i].getText());
			this.add(towers[i]);
		}
		
		try{
			backg= ImageIO.read(new File("pics/Pre Battle Screen.jpg"));
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
	
	public void actionPerformed(ActionEvent e){
			
		if(e.getActionCommand().equals("Start")) {
			MainGameScreen screen;
			screen = new MainGameScreen(chosenTowersButtons);
			AnimalFarm.animalfarm.add(screen);
			AnimalFarm.animalfarm.remove(0);
			AnimalFarm.animalfarm.dispose();
			JFrame f = new JFrame();
			f.add(screen);
			AnimalFarm.animalfarm = f;
			AnimalFarm.animalfarm.setTitle("Animal Farm");
			AnimalFarm.animalfarm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			AnimalFarm.animalfarm.dispose();
			AnimalFarm.animalfarm.setExtendedState(JFrame.MAXIMIZED_BOTH);
			AnimalFarm.animalfarm.setVisible(true);
			AnimalFarm.animalfarm.repaint();
		} else if(e.getActionCommand().equals("Back")){
			MainMenu screen = new MainMenu();
			AnimalFarm.animalfarm.add(screen);
			AnimalFarm.animalfarm.remove(0);
			AnimalFarm.animalfarm.dispose();
			JFrame f = new JFrame();
			f.add(screen);
			AnimalFarm.animalfarm = f;
			AnimalFarm.animalfarm.setTitle("Animal Farm");
			AnimalFarm.animalfarm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			AnimalFarm.animalfarm.dispose();
			AnimalFarm.animalfarm.setExtendedState(JFrame.MAXIMIZED_BOTH);
			AnimalFarm.animalfarm.setVisible(true);
			AnimalFarm.animalfarm.repaint();
		} else {
			
		}

		for(int i = 0; i < towers.length; i++) {
			if(e.getActionCommand().equals(towerNames[i].getText()) && towers[i].getLocation() != new Point((int) (400 + 200 * (i -.5)) - 250 , 250)) {
				towers[i].move((int) (400 + 200 * (i -.5)) - 250 , 450);
				chosenTowersButtons[i] = towers[i];
			} else if(e.getActionCommand().equals(towerNames[i].getText())  && towers[i].getLocation() != new Point((int) (400 + 200 * (i -.5)) - 250 , 450)){
				towers[i].setLocation((int) (400 + 200 * (i -.5)) - 250 , 250);
			} else {
				
			}
		
		}
	}
}
