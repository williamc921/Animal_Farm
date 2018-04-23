package enemies;
import general.Game;
import general.Grid;
public abstract class Boss extends Enemy{
	public Boss(){
		super();
		setHealth(200);
		setSpeed(200);
		setDamage(40);
		setDrops(100);
	}
}