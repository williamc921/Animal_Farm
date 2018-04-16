package general;
import java.util.Random;
/**
 * @author parkertewell
 * Game
 * Plots (Matrix, 5 rows, 10 columns)
 * The 10th column is only used to place enemies
 * Money, lives, enemies left
 * Towers available
 */
public class Grid {
	public static final int EMPTY = 0;
	public static final int PEASHOOTER = 1;
	public static final int SHEEP = -1, COW = -1, PIG = -1, 
			WOLF = -2, CHICKEN = -2, HORSE = -2;
	private int[][] grid;
	public Grid(){
		grid = new int[5][10];
	}
	/**
	 * Use to place towers and boss
	 * @param update The type of tower the user has placed/
	 * the type of enemy that has moved or been spawned
	 * @param row
	 * @param column
	 */
	public void setStatus(int update, int row, int column){
		grid[row][column] = update;
	}
	public int getStatus(int row, int column){
		return grid[row][column];
	}
	/**
	 * CAN ONLY SEND 5 ENEMIES AT A TIME
	 * Use to send many low level enemies, 
	 * must stagger the waves so the user isnt overwhelmed.
	 * i.e. if you wanted to send 20 enemies send 4 waves of 5 enemies each
	 * @param regular Amount of regular enemies
	 * @param fast Amount of fast enemies
	 */
	public void sendWave(int regular, int fast, int tank){
		Random rand = new Random();
		while(0 < regular+fast+tank){
			int type = (rand.nextInt(3) + 1) * -1, row = (rand.nextInt(5));
			
		}
	}
	/**
	 * Use this to send a single enemy i.e. the boss.
	 * Doesn't check if placement area is clear
	 * @param type
	 */
	public void sendEnemy(int type){
		Random rand = new Random();
		int row = (rand.nextInt(5));
		setStatus(type, row, 9);
	}
}