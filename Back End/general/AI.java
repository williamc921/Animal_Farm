package general;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
public abstract class AI implements ActionListener{
	protected Timer speed;
	protected String name;
	protected int health, damage, gridVal, row, column;
	protected BufferedImage image;
	protected Game game = null;
	protected Grid grid = null;
	protected Player player = null;
	public AI(Game newGame){
		game = newGame;
		grid = newGame.getGrid();
		player = newGame.getPlayer();
	}
	public String getName(){
		return name;
	}
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
	public int getColumn(){
		return column;
	}
	public int getRow(){
		return row;
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
	public void setName(String newVal){
		name = newVal;
	}
	public void setColumn(int newVal){
		column = newVal;
	}
	public void setRow(int newVal){
		row = newVal;
	}
	public abstract void actionPerformed(ActionEvent e);
}