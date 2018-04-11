import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class Game implements ActionListener{
	//Multi-threading?
	//For each enemy/tower type
	//1600x900
	//make sure the enemies dont march thru the towers
	//enemies stop one plot in front on the towers and attack them with the same speed
	private int enemies, towers;
	public Game(int waves){
		Timer time = new Timer(100,this);
		time.start();
	}
	public void actionPerformed(ActionEvent e){
		
	}
}