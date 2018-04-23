import java.io.IOException;
import enemies.Sheep;
import general.Game;
import general.Grid;
import general.Player;
import towers.Peashooter;
import towers.Tower;
public class GridTester {
	public static void main(String args[]) throws IOException{
		attackingEnemyTest();
	}
	private static void attackingEnemyTest() throws IOException{
		Game testGame = new Game(new Grid(), new Player());
		for(int i = 0; i < 4; i++)
			testGame.getPlayer().purchaseTower(new Peashooter(), testGame.getGrid(), i, 0);
		testGame.getGrid().sendEnemy(new Sheep(testGame));
		testGame.getGrid().displayGrid();
		while(true){}
	}
	private static void basicTests() throws IOException{
		//	int[][]waves = new int[2][2];
		//	for(int i = 0; i < 2; i++)
		//		for(int j = 0; j < 2; j++)
		//			waves[i][j] = -1;
		Game testGame = new Game(new Grid(), new Player());
		System.out.println("Initial wave");
		testGame.getGrid().displayGrid();
		System.out.println("Placing a tower");
		testGame.getPlayer().purchaseTower(new Peashooter(testGame), testGame.getGrid(), 0, 0);
		testGame.getGrid().displayGrid();
		System.out.println("Sending an overlapping wave");
		testGame.getGrid().sendWave(2, 2, 1);
		testGame.getGrid().displayGrid();
	}
	private static void movingEnemyTest() throws IOException{
		Game testGame = new Game(new Grid(), new Player());
		testGame.getGrid().sendEnemy(new Sheep(testGame));
		testGame.getGrid().displayGrid();
		while(true){}
	}
}