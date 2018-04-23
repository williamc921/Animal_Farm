package general;
import java.io.IOException;
import java.util.Random;

import enemies.Chicken;
import enemies.Enemy;
import enemies.Pig;
import enemies.Sheep;
/**
 * @author parkertewell
 * Game
 * Plots (Matrix, 4 rows, 10 columns)
 * The 10th column is only used to place enemies
 * Money, lives, enemies left
 * Towers available
 */
public class Grid {
	public static final int EMPTY = 0;
	public static final int PEASHOOTER = 1;
	public static final int SHEEP = -1, COW = -1, PIG = -1, 
			WOLF = -2, CHICKEN = -2, HORSE = -2;
	private AI[][] grid;
	public Grid(){
		grid = new AI[4][10];
		//setStatus(new Sheep(this),3,8);
	}
	/**
	 * Use to place towers and boss
	 * @param update The type of tower the user has placed/
	 * the type of enemy that has moved or been spawned
	 * @param row
	 * @param column
	 */
	public void setStatus(AI update, int row, int column){
		grid[row][column] = update;
	}
	public AI getStatus(int row, int column){
		return grid[row][column];
	}
	/**
	 * CAN ONLY SEND 4 ENEMIES AT A TIME
	 * Use to send many low level enemies, 
	 * must stagger the waves so the user isnt overwhelmed.
	 * i.e. if you wanted to send 20 enemies send 4 waves of 4 enemies each
	 * Order of variables is regular, fast, tank
	 * @param regular Amount of regular enemies
	 * @param fast Amount of fast enemies
	 * @param tank Amount of tank enemies
	 * @throws IOException Thrown if retreving an enemies' image fails
	 */
	public void sendWave(int regular, int fast, int tank) throws IOException{
		if(columnClear(9)){
			int total = regular+fast+tank;
			for(int i = 0; i < total; i++){
				boolean statusSet = false;
				while(!statusSet){
					Enemy randEnemy = randomEnemy();
					if((randEnemy.getGridVal() == -1 && regular > 0) ||
							(randEnemy.getGridVal() == -2 && fast > 0) 
							|| (randEnemy.getGridVal() == -3 && tank > 0)){
						setStatus(randEnemy,i,9);
						statusSet = true;
						if(randEnemy.getGridVal() == -1)
							regular--;
						else if(randEnemy.getGridVal() == -2)
							fast--;
						else
							tank--;
					}
				}
			}
		}
	}
	public boolean columnClear(int column){
		boolean clear = true;
		for(int i = 0; i < 4; i++)
			if(getStatus(i,column)!=null)
				clear = false;
		return clear;
	}
	public Enemy randomEnemy() throws IOException{
		Random rand = new Random();
		Enemy enemy = null;
		int type = (rand.nextInt(3) + 1) * -1;
		if(type == -1)
			enemy = new Sheep();
		else if(type == -2)
			enemy = new Chicken();
		else
			enemy = new Pig();
		return enemy;
	}
	/**
	 * Use this to send a single enemy i.e. the boss.
	 * Doesn't check if placement area is clear
	 * @param type
	 */
	public void sendEnemy(AI type){
		Random rand = new Random();
		int row = (rand.nextInt(4));
		type.setColumn(9);
		type.setRow(row);
		setStatus(type, row, 9);
	}
	public void displayGrid(){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 10; j++)
				if(getStatus(i, j)!=null)
					System.out.print(getStatus(i, j).getName() + " ");
				else
					System.out.print(getStatus(i, j) + " ");
			System.out.println();
		}
	}
}