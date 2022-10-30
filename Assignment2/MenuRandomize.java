package men83_MenuManager;
/*Class MenuRandomize
 * @author: Morgan Noonan
 * created: 10/30/22
 */
import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad>salads;
	private ArrayList<Dessert> desserts;
/*Constructor MenuRandomize
 * @param entreeFile a String
 * @param sideFile a String
 * @param saladFile a String
 * @param dessertFile a String
 */
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		FileManager manage = new FileManager();
		entrees = manage.readEntrees(entreeFile);
		sides = manage.readSides(sideFile);
		salads = manage.readSalads(saladFile);
		desserts = manage.readDesserts(dessertFile);
	}
	/*Method randomMenu
	 * @return the menu
	 */
	public Menu randomMenu() {
		Random r = new Random();
		Entree rEntree = entrees.get(r.nextInt(4));
		Side rSide = sides.get(r.nextInt(4));
		Salad rSalad = salads.get(r.nextInt(4));
		Dessert rDessert = desserts.get(r.nextInt(4));
		Menu createMenu = new Menu("MenuName", rEntree, rSide, rSalad, rDessert);

		return createMenu;
	}
}
