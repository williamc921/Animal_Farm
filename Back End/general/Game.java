package general;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Timer;
public class Game{
	//Multi-threading?
	//For each enemy/tower type
	//1600x900
	//make sure the enemies dont march thru the towers
	//enemies stop one plot in front on the towers and attack them with the same speed
	private int enemies, towers;
	public static Grid grid = new Grid();
	public static Player player = new Player();
	public Game(int waves) throws IOException{
		grid.sendWave(5, 0, 0);
		
	}
}