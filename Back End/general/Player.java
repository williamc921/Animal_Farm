package general;
import java.util.ArrayList;

import towers.Tower;
/**
 * health, money, avalible towers
 * @author parkertewell
 */
public class Player {
	private int health = 10, money = 100;
	private ArrayList<Tower> towers = new ArrayList();
	public Tower getTower(int num){
		return towers.get(num);
	}
	public int getHealth(){
		return health;
	}
	public int getMoney(){
		return money;
	}
	public void setTower(Tower newVal){
		towers.add(newVal);
	}
	public void setHealth(int newVal){
		health = newVal;
	}
	public void setMoney(int newVal){
		money = newVal;
	}
	public void purchaseTower(Tower tower, Grid grid, int row, int column){
		if(grid.getStatus(row, column) == null && getMoney() >= tower.getPrice()){
			setMoney(getMoney() - tower.getPrice());
			grid.setStatus(tower, row, column);
		}
	}
}