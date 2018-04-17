import java.io.IOException;
import general.Game;
import general.Grid;
import general.Player;
import towers.Peashooter;
import towers.Tower;
public class GridTester {
	public static void main(String args[]) throws IOException{
		Game testGame = new Game(1, new Grid(), new Player());
		System.out.println("Initial wave");
		testGame.getGrid().displayGrid();
		System.out.println("Placing a tower");
		testGame.getPlayer().purchaseTower(new Peashooter(), testGame.getGrid(), 0, 0);
		testGame.getGrid().displayGrid();
		System.out.println("Sending an overlapping wave");
		testGame.getGrid().sendWave(2, 2, 1);
		testGame.getGrid().displayGrid();
	}
}