package men83_MenuManager;
/**
 * Class MenuTest
 * author: Morgan Noonan
 *created: 10/10/2022
 */
public class MenuTest {

	public static void main(String[] args) {
		//testing entree, side, salad, and dessert class
		Entree e1 = new Entree("chez", "cheesy", 134);
		Entree e2 = new Entree("grilled", "cheddar", 169);
		Side si = new Side("veggie", "ew", 10);
		Salad sa1 = new Salad("ceasar", "yuck", 40);
		Salad sa2 = new Salad("blue", "yum", 34);
		Dessert d = new Dessert("apple pie", "warm", 160);

		Menu m1 = new Menu("YUMYUM",e1,si,sa1,d);
		Menu m2 = new Menu("food",e2,null,sa2, null);
		//testing menu class
		m1.setName("fun food");
		System.out.println("Menu: "+ m1.getName());
		System.out.println(m1.description());
		System.out.println(m1.totalCalories()+ " calories\n");
		System.out.println("Menu: "+ m2.getName());
		System.out.println(m2.description());
		System.out.println(m2.totalCalories()+ " calories\n");
	}

}



