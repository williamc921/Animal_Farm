package enemies;

import general.Game;
import general.Grid;

public abstract class Tank extends Enemy{
	public Tank(Game game){
		super(game);
		setHealth(100);
		setSpeed(20);
		setDamage(10);
		setDrops(20);
	}
}