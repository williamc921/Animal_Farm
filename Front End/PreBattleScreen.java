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
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Start")) {
			MainGameScreen screen = new MainGameScreen();
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
		}
		
	}

}
