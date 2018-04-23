package enemies;
import general.Game;
public abstract class Regular extends Enemy{
	public Regular(){
		setHealth(50);
		setSpeed(2000);
		setDamage(20);
		setDrops(10);
		speed.start();
	}
}