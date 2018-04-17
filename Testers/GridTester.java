import java.io.IOException;
import general.Game;
import general.Grid;
import general.Player;
import towers.Peashooter;
public class GridTester {
	public static void main(String args[]) throws IOException{
		Player testPlayer = new Player();
		Grid testGrid = new Grid();
		Game testGame = new Game(1, testGrid, testPlayer);
		System.out.println("Initial wave");
		testGame.grid.displayGrid();
		System.out.println("Placing a tower");
		testPlayer.purchaseTower(new Peashooter(), 0, 0);
		Game.grid.displayGrid();
		System.out.println("Sending an overlapping wave");
		Game.grid.sendWave(2, 2, 1);
		Game.grid.displayGrid();
	}
}