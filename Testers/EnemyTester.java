import java.io.IOException;

import enemies.Enemy;
import enemies.Sheep;
import general.Game;
import general.Grid;
import general.Player;
public class EnemyTester {
	public static void main(String[] args) throws IOException{
		//Game testGame = new Game(1, new Grid(), new Player());
		//testGame.getGrid().sendEnemy(new Sheep(testGame.getGrid()));
		//testGame.getGrid().displayGrid();
		Enemy testEnemy = new Sheep(new Game(new Grid(), new Player()));
		testEnemy.getGrid().displayGrid();


	}
}