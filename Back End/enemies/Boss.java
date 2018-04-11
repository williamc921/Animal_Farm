package enemies;
public abstract class Boss extends Enemy{
	public Boss(){
		setHealth(200);
		setSpeed(200);
		setDamage(40);
		setDrops(100);
	}
}