package enemies;
public abstract class Fast extends Enemy{
	public Fast(){
		setHealth(50);
		setSpeed(50);
		setDamage(10);
		setDrops(10);
	}
}