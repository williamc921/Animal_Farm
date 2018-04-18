package enemies;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import general.AI;
import general.Grid;
import towers.Tower;
/**
 * Current enemies:
 * -1 sheep, -3 pig
 * @author parkertewell
 */
public abstract class Enemy extends AI {
	protected int drops;
	protected Grid grid;
	public Enemy(Grid newgrid){
		grid = newgrid;
		speed = new Timer(1000,this);
		speed.start();
	}
	public int getDrops(){
		return drops;
	}
	/**
	 * @return time in milliseconds for the enemy to advance 1 plot
	 */
	public Timer getSpeed(){
		return speed;
	}
	public void setDrops(int newVal){
		drops = newVal;
	}
	/**
	 * @param newVal time in milliseconds for the enemy to advance 1 plot
	 */
	public void setSpeed(int newVal){
		speed = new Timer(newVal, this);
	}
	public void attack(){
		
	}
	/**
	 * Tries to move enemy to next tile,
	 * if the tile is a tower attack
	 * if the tile is blocked by another enemy do nothing
	 */
	public void actionPerformed(ActionEvent e){
		System.out.println("Test");
		/* if enemy is in last tile
		 * subtract a life and then
		 * delete the enemy
		 */
		if(column == 0){
			setHealth(getHealth()-1);
		}else if(grid.getStatus(row, column+1) == null){
			System.out.println("Moved");
			column++;
			grid.setStatus(this, row, column);
			grid.setStatus(null, row, column--);
		}else if(grid.getStatus(row, column+1) instanceof Tower){
			System.out.println("Attacked");
			attack();
		}
	}
}