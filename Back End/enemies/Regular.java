package enemies;
import general.Grid;
public abstract class Regular extends Enemy{
	public Regular(Grid newGrid){
		super(newGrid);
		setHealth(50);
		setSpeed(100);
		setDamage(20);
		setDrops(10);
	}
}