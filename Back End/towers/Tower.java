package towers;
import java.awt.event.ActionEvent;

import general.AI;
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}