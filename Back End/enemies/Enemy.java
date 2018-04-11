package enemies;
/**
 * Current enemies:
 * -1 sheep
 * @author parkertewell
 */
public abstract class Enemy {
	private int health, speed, damage, drops, gridVal;
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
	public int getSpeed(){
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
		speed = newVal;
	}
}