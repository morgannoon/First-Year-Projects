package men83_MenuManager_v3;
/**
 * Class Salad
 * author: Morgan Noonan
 *created: 11/14/2022
 */
public class Salad extends MenuItem{

	public Salad(String n, String d, int c,  double p) {
		super(n,d,c,p);
	}

	@Override
	public String toString() {
		return "Salad [getName()=" + getName() + ", getDesc()=" + getDesc() + ", getCal()=" + getCal() + ", getPrice()="
				+ getPrice() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
