import towers.Peashooter;
public class GridTester {
	public static void main(String args[]){
		Player testPlayer = new Player();
		System.out.println("Initial");
		displayGrid(testPlayer);
		System.out.println("Placing a tower");
		testPlayer.purchaseTower(new Peashooter(), 0, 0);
		displayGrid(testPlayer);
		System.out.println("Sending a wave");
		testPlayer.getGrid().sendWave(2, 3);
		displayGrid(testPlayer);
	}
	private static void displayGrid(Player testPlayer){
		Grid test = testPlayer.getGrid();
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++)
				System.out.print(test.getStatus(i, j) + " ");
			System.out.println();
		}
	}
}