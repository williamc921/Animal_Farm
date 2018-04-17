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
	public static Grid grid;
	public static Player player;
	public Game(int waves, Grid newGrid, Player newPlayer) throws IOException{
		grid = newGrid;
		player = newPlayer;
		grid.sendWave(5, 0, 0);
		
	}
}