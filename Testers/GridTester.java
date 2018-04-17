import java.io.IOException;
import general.Game;
import general.Grid;
import general.Player;
import towers.Peashooter;
import towers.Tower;
public class GridTester {
	public static void main(String args[]) throws IOException{
		Player testPlayer = new Player();
		Grid testGrid = new Grid();
		Game testGame = new Game(1, testGrid, testPlayer);
		System.out.println("Initial wave");
		testGame.grid.displayGrid();
		System.out.println("Placing a tower");
		testPlayer.purchaseTower(new Peashooter(), 0, 0);
		testGame.grid.displayGrid();
		System.out.println("Sending an overlapping wave");
		testGame.grid.sendWave(2, 2, 1);
		testGame.grid.displayGrid();
	}
}