package enemies;
import general.Game;
import general.Grid;
public abstract class Fast extends Enemy{
	public Fast(Grid grid){
		super(grid);
		setHealth(50);
		setSpeed(50);
		setDamage(10);
		setDrops(20);
	}
}