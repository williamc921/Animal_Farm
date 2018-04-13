package enemies;
import general.Grid;
public abstract class Fast extends Enemy{
	public Fast(Grid newGrid){
		super(newGrid);
		setHealth(50);
		setSpeed(50);
		setDamage(10);
		setDrops(20);
	}
}