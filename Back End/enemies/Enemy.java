package enemies;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import general.AI;
import general.Game;
import general.Grid;
import general.Player;
import towers.Tower;
/**
 * Current enemies:
 * -1 sheep, -3 pig
 * @author parkertewell
 */
public abstract class Enemy extends AI {
	protected int drops;
	public Grid getGrid(){
		return Game.grid;
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
		/* if enemy is in last tile
		 * subtract a life and then
		 * delete the enemy
		 */
		if(column == 0){
			System.out.println("Attacking House");
			Game.player.setHealth(Game.player.getHealth()-1);
			System.out.println("Player Health: " + Game.player.getHealth());
		}else if(Game.grid.getStatus(row, column-1) == null){
			System.out.println("Moved");
			Game.grid.setStatus(null, row, column);
			Game.grid.setStatus(this, row, column-1);
			column--;
		}else if(Game.grid.getStatus(row, column-1) instanceof Tower){
			System.out.println("Attacked");
			Game.grid.getStatus(row, column-1).setHealth(Game.grid.getStatus(row, column-1).getHealth()-getDamage());
			if(Game.grid.getStatus(row, column-1).getHealth()<=0)
				Game.grid.setStatus(null, row, column-1);
		}
		System.out.println("Column "+column);
		System.out.println("Row "+row);
		Game.grid.displayGrid();
	}
}