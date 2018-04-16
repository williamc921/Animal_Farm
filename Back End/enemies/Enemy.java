package enemies;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import general.Game;
/**
 * Current enemies:
 * -1 sheep, -3 pig
 * @author parkertewell
 */
public abstract class Enemy implements ActionListener {
	//private Grid grid;
	private BufferedImage image;
	private Timer speed;
	private int health, damage, drops, gridVal, row, column;
	public Enemy(){
		
	}
	public BufferedImage getImage(){
		return image;
	}
	public int getHealth(){
		return health;
	}
	public int getDamage(){
		return damage;
	}
	public int getGridVal(){
		return gridVal;
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
	public void setHealth(int newVal){
		health = newVal;
	}
	public void setDamage(int newVal){
		damage = newVal;
	}
	public void setGridVal(int newVal){
		gridVal = newVal;
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
	public void setImage(BufferedImage newImage){
		image = newImage;
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
			Game.player.setHealth(Game.player.getHealth()-1);
			setHealth(0);
		}else if(Game.grid.getStatus(row, column+1) == 0){
			column++;
			Game.grid.setStatus(gridVal, row, column);
		}else if(Game.grid.getStatus(row, column+1) > 0){
			attack();
		}
	}
}