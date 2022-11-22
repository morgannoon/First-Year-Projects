package men83_MenuManager_v3;
/**
 * Class MenuTest
 * author: Morgan Noonan
 *created: 11/18/2022
 */
public class MenuTest {

	public static void main(String[] args) {
		//testing manueRandomize & FileManager
		MenuManager randomize = new MenuManager("data/dishes.txt");
		Menu myMenu = randomize.randomMenu("NameOfMenu");
		System.out.println(myMenu.description()+"\nTotal calories: "+
				myMenu.totalCalories());

	}

}



