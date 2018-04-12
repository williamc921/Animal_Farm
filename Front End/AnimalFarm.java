import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
public class AnimalFarm
{
	public AnimalFarm() {
		animalfarm  = new JFrame();
		animalfarm.setTitle("Animal Farm");
		animalfarm.add(new MainMenu());
		animalfarm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		animalfarm.setExtendedState(JFrame.MAXIMIZED_BOTH);
		AnimalFarm.animalfarm.dispose();
		animalfarm.setVisible(true);
	}
	static Timer t = new Timer();
	static JFrame animalfarm;
	public static void main(String[] args){
		new AnimalFarm();
		t.schedule(new TimerTask(){
			public void run() {
				animalfarm.repaint();
			}
		}, 0,10);
	}
}