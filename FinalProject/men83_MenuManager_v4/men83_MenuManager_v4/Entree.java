package men83_MenuManager_v4;

/**
 * Class Entree
 * author: Morgan Noonan
 *created: 11/14/2022
 */
public class Entree extends MenuItem{

	public Entree(String n, String d, int c, double p) {
		super(n,d,c,p);
	}

	@Override
	public String toString() {
		return  getName() + "@@" + getDesc() + "@@" + getCal()
		+ "@@" + getPrice() + "@@" + super.toString() + "@@" + getClass()
		+ "@@" + hashCode();
	}
}
