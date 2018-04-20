package enemies;
import javax.swing.Timer;

import general.Grid;

public abstract class Regular extends Enemy{
	public Regular(Grid grid){
		super(grid);
		setHealth(50);
		setSpeed(2000);
		setDamage(20);
		setDrops(10);
		speed.start();
	}
}