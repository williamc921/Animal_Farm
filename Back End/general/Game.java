package general;
import java.io.IOException;
import enemies.Sheep;
public class Game{
	//Multi-threading?
	//For each enemy/tower type
	//1600x900
	//make sure the enemies dont march thru the towers
	//enemies stop one plot in front on the towers and attack them with the same speed
	public static Grid grid = new Grid();
	public static Player player = new Player();
	public Game(Grid newGrid, Player newPlayer) throws IOException{
		grid = newGrid;
		player = newPlayer;
	}
	public Game() throws IOException{
		grid = new Grid();
		player = new Player();
	}
	public void runGame() throws IOException{
		grid.sendEnemy(new Sheep());
		
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