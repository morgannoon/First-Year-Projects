package men83_MenuManager;
/**
 * Class Menu
 * author: Morgan Noonan
 *created: 10/4/2022
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
			printE = "\nEntree: "+entree.getDesc();
		}
		if(side==null) {
			printSi = "\nSide: N/A";
		}
		else {
			printSi = "\nSide: "+side.getDesc();
		}
		if(salad==null) {
			printSa = "\nSalad: N/A";
		}
		else {
			printSa = "\nSalad: "+salad.getDesc();
		}
		if(dessert==null) {
			printD = "\nDessert: N/A";
		}
		else {
			printD = "\nDessert: "+dessert.getDesc();
		}
		return printE+printSi+printSa+printD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
