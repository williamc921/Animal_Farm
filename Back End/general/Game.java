package general;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.Timer;

import towers.Tower;
public class Game{
	//Multi-threading?
	//For each enemy/tower type
	//1600x900
	//make sure the enemies dont march thru the towers
	//enemies stop one plot in front on the towers and attack them with the same speed
	private Grid grid;
	private Player player;
	public Game(int waves, Grid newGrid, Player newPlayer) throws IOException{
		grid = newGrid;
		player = newPlayer;
	}
	public Grid getGrid(){
		return grid;
	}
	public Player getPlayer(){
		return player;
	}
	public void setGrid(Grid newVal){
		grid = newVal;
	}
	public void setPlayer(Player newVal){
		player = newVal;
	}
}