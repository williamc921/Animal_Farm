package towers;
/**
 * Current towers:
 * 1 peashooter
 * @author parkertewell
 */
public abstract class Tower {
	private int health, damage, gridVal, price;
	public int getHealth(){
		return health;
	}
	public int getDamage(){
		return damage;
	}
	public int getGridVal(){
		return gridVal;
	}
	public int getPrice(){
		return price;
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
	public void setPrice(int newVal){
		price = newVal;
	}
}