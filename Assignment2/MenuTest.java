package men83_MenuManager;
/**
 * Class MenuTest
 * author: Morgan Noonan
 *created: 10/10/2022
 */
public class MenuTest {

	public static void main(String[] args) {
		//testing manueRandomize & FileManager
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
				"data/sides.txt","data/salads.txt","data/desserts.txt");
			Menu myMenu = randomize.randomMenu();
			System.out.println(myMenu.description()+"\nTotal calories: "+
								myMenu.totalCalories());

	}

}



