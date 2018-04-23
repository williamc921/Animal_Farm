package towers;
import java.awt.event.ActionEvent;
import enemies.Enemy;
import general.AI;
import general.Game;
/**
 * Current towers:
 * 1 peashooter
 * @author parkertewell
 */
public abstract class Tower extends AI{
	public Tower(Game newGame) {
		super(newGame);
	}
	private int price;
	public int getPrice(){
		return price;
	}
	public void setPrice(int newVal){
		price = newVal;
	}
	public void actionPerformed(ActionEvent e) {
		if(searchRow() != -1)
			grid.getStatus(row, searchRow()).setHealth(grid.getStatus(row, searchRow()).getHealth()-getDamage());
	}
	private int searchRow(){
		for(int i = row; i < 10; i++)
			if(grid.getStatus(row, i) instanceof Enemy)
				return i;
		return -1;
	}
}