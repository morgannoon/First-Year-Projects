package men83_MenuManager_v3;
/**
 * Class Menu
 * author: Morgan Noonan
 *created: 11/14/2022
 */
public class Menu {
	private String name;
	private Entree entree=null;
	private Salad salad=null;
	private Side side=null;
	private Dessert dessert=null;

	public Menu(String n) {
		name=n;
		entree=null;
		side=null;
		salad= null;
		dessert = null;
	}
	public Menu(String n, Entree e, Side si) {
		name=n;
		entree=e;
		side=si;
	}
	public Menu(String n, Entree e, Side si, Salad sa, Dessert d) {
		name=n;
		entree=e;
		side=si;
		salad= sa;
		dessert = d;
	}


	public int totalCalories() {
		int totalCal=0;
		if(entree==null) {
			totalCal+=0;
		}
		else {
			totalCal+=entree.getCal();
		}
		if(side==null) {
			totalCal+=0;
		}
		else {
			totalCal+=side.getCal();
		}
		if(salad==null) {
			totalCal+=0;
		}
		else {
			totalCal+=salad.getCal();
		}
		if(dessert==null) {
			totalCal+=0;
		}
		else {
			totalCal+=dessert.getCal();
		}
		return totalCal;
	}
	public String description() {
		String printE;
		String printSi;
		String printSa;
		String printD;
		if(entree==null) {
			printE = "\nEntree: N/A";
		}
		else {
			printE = "\nEntree\n"+entree.getName()+": "+entree.getDesc();
		}
		if(side==null) {
			printSi = "\nSide: N/A";
		}
		else {
			printSi = "\nSide\n"+side.getName()+": "+side.getDesc();
		}
		if(salad==null) {
			printSa = "\nSalad: N/A";
		}
		else {
			printSa = "\nSalad\n"+salad.getName()+": "+salad.getDesc();
		}
		if(dessert==null) {
			printD = "\nDessert: N/A";
		}
		else {
			printD = "\nDessert\n"+dessert.getName()+": "+dessert.getDesc();
		}
		return getName()+"\n"+printE+printSi+printSa+printD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	@Override
	public String toString() {
		return "Menu [name=" + name + ", entree=" + entree + ", salad=" + salad + ", side=" + side + ", dessert="
				+ dessert + "]";
	}
}
