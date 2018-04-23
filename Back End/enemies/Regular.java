package enemies;
import javax.swing.Timer;

import general.Game;
import general.Grid;

public abstract class Regular extends Enemy{
	public Regular(Game game){
		super(game);
		setHealth(50);
		setSpeed(2000);
		setDamage(20);
		setDrops(10);
		speed.start();
	}
}