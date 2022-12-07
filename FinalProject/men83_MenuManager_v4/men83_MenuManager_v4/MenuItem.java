package men83_MenuManager_v4;
/**
 * Class MenuItem
 * author: Morgan Noonan
 *created: 11/14/2022
 */
public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;

	public MenuItem(String n, String d, int c, double p) {
		this.name = n;
		this.description = d;
		this.calories = c;
		this.price = p;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public int getCal() {
		return calories;
	}
	public void setCal(int cal) {
		this.calories = cal;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		this.price=p;
	}
	@Override
	public String toString() {
		return name + "@@" + description + "@@" + calories + "@@" + price;
	}
}
