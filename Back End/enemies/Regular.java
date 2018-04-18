package enemies;
import general.Grid;

public abstract class Regular extends Enemy{
	public Regular(Grid grid){
		super(grid);
		setHealth(50);
		setSpeed(500);
		setDamage(20);
		setDrops(10);
	}
}