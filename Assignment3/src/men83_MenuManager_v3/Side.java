package men83_MenuManager_v3;
/**
 * Class Side
 * author: Morgan Noonan
 *created: 11/14/2022
 */
public class Side extends MenuItem{

	public Side(String n, String d, int c, double p) {
		super(n,d,c,p);
	}

	@Override
	public String toString() {
		return "Side [getName()=" + getName() + ", getDesc()=" + getDesc() + ", getCal()=" + getCal() + ", getPrice()="
				+ getPrice() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
