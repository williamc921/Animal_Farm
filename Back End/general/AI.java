package general;
import java.awt.image.BufferedImage;
public class AI {
	protected int health, damage, gridVal, row, column;
	protected BufferedImage image;
	public BufferedImage getImage(){
		return image;
	}
	public int getHealth(){
		return health;
	}
	public int getDamage(){
		return damage;
	}
	public int getGridVal(){
		return gridVal;
	}
	public void setImage(BufferedImage newImage){
		image = newImage;
	}
	public void setHealth(int newVal){
		health = newVal;
	}
	public void setDamage(int newVal){
		damage = newVal;
	}
	public void setGridVal(int newVal){
		gridVal = newVal;
	}
}
