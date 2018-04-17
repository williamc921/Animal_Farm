import java.io.IOException;

import enemies.Sheep;
import general.Game;
import general.Grid;
import general.Player;
public class EnemyTester {
	public static void main(String[] args) throws IOException{
		Game game = new Game(1);
	}
	private static void displayGrid(Player testPlayer){
		Grid test = Game.grid;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++)
				if(test.getStatus(i, j)!=null)
					System.out.print(test.getStatus(i, j).getName() + " ");
				else
					System.out.print(test.getStatus(i, j) + " ");
			System.out.println();
		}
	}
}