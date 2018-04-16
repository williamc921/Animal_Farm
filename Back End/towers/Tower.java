package towers;
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
}