package enemies;
import general.Grid;
public abstract class Tank extends Enemy{
	public Tank(Grid newGrid){
		super(newGrid);
		setHealth(100);
		setSpeed(20);
		setDamage(10);
		setDrops(20);
	}
}