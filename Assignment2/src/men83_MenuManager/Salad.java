package men83_MenuManager;
/**
 * Class Salad
 * author: Morgan Noonan
 *created: 10/3/2022
 */
public class Salad {
	private String name;
	private String desc;
	private int cal;
	public Salad(String n, String d, int c) {
		name=n;
		desc=d;
		cal=c;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
	}
}
