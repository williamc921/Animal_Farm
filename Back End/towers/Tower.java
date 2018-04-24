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
	private int price;
	public int getPrice(){
		return price;
	}
	public void setPrice(int newVal){
		price = newVal;
	}
	public void actionPerformed(ActionEvent e) {
		int column = searchRow();
		if(column != -1){
			Game.grid.getStatus(row, column).setHealth(Game.grid.getStatus(row, column).getHealth()-getDamage());
			System.out.println("Shot enemy");
		}
	}
	private int searchRow(){
		for(int i = row; i < 10; i++){
			//System.out.println(Game.grid.getStatus(row, i) instanceof Enemy);
			if(Game.grid.getStatus(row, i) instanceof Enemy)
				return i;
		}
		return -1;
	}
}