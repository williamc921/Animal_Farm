package enemies;
import general.Grid;
public abstract class Boss extends Enemy{
	public Boss(Grid grid){
		super(grid);
		setHealth(200);
		setSpeed(200);
		setDamage(40);
		setDrops(100);
	}
}