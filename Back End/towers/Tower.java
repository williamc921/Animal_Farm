package towers;
/**
 * Current towers:
 * 1 peashooter
 * @author parkertewell
 */
public abstract class Tower {
	private int price;
	public int getPrice(){
		return price;
	}
	public void setPrice(int newVal){
		price = newVal;
	}
}