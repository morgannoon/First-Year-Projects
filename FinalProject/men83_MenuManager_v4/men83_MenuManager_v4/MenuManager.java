package men83_MenuManager_v4;
/**
 * Class MenuManager
 * author: Morgan Noonan
 *created: 11/14/2022
 */
import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	/**
	 * Class MenuManager
	 * @param dishesFile String
 	*/
	public MenuManager(String dishesFile) {
		FileManager manage = new FileManager();
		ArrayList<MenuItem> array = new ArrayList<MenuItem>();
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
		array = manage.readItems(dishesFile);

		for( int k =0; k<array.size();k++) {

			if(array.get(k) instanceof Entree) {
				entrees.add((Entree) array.get(k));
			}
			else if(array.get(k) instanceof Side) {
				sides.add((Side) array.get(k));
			}
			else if(array.get(k) instanceof Salad) {
				salads.add((Salad) array.get(k));
			}
			else if(array.get(k) instanceof Dessert) {
				desserts.add((Dessert) array.get(k));
			}

		}

	}
	/**
	 * Method randmMenu
	 * @param name String
	 * @return createMenu Menu
	 */
	public Menu randomMenu(String name) {
		Random r = new Random();
		Entree rEntree =  entrees.get(r.nextInt(entrees.size() - 1));
		Side rSide =  sides.get(r.nextInt(sides.size() - 1));
		Salad rSalad = salads.get(r.nextInt(salads.size() - 1));
		Dessert rDessert =  desserts.get(r.nextInt(desserts.size() - 1));
		Menu createMenu = new Menu(name, rEntree, rSide, rSalad, rDessert);
		return createMenu;
	}
	/*public Menu minCaloriesMenu(String name) {

	}
	public Menu maxCaloriesMenu(String name) {

	}*/
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}
	public ArrayList<Side> getSides() {
		return sides;
	}
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}
	public ArrayList<Salad> getSalads() {
		return salads;
	}
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
}
