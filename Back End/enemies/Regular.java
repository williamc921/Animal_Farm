package enemies;
public abstract class Regular extends Enemy{
	public Regular(){
		setHealth(50);
		setSpeed(100);
		setDamage(20);
		setDrops(10);
	}
}