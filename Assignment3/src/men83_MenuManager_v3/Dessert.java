package men83_MenuManager_v3;
/**
 * Class Dessert
 * author: Morgan Noonan
 *created: 11/14/2022
 */
public class Dessert extends MenuItem{

	public Dessert(String n, String d, int c, double p) {
		super(n,d,c,p);
	}

	@Override
	public String toString() {
		return "Dessert [getName()=" + getName() + ", getDesc()=" + getDesc() + ", getCal()=" + getCal()
		+ ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + "]";
	}

}
