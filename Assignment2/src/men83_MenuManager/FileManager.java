package men83_MenuManager;
/*Class FileManager
 * @author: Morgan Noonan
 * created: 10/30/22
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	/*
	 * Method readEntrees
	 * @param fileName String
	 * @return Entree ArrayList
	 */
	public static ArrayList<Entree> readEntrees(String fileName){
		ArrayList<Entree> entreeList = new ArrayList<Entree>();
		String inputPath = fileName;
		try {
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Entree e = new Entree(temp[0], temp[1],Integer.parseInt(temp[2]));
					entreeList.add(e);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}

			}
			br.close();
			fr.close();
		} 
		catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return entreeList;
	}
	/*
	 * Method readSides
	 * @param fileName String
	 * @return Side ArrayList
	 */
	public static ArrayList<Side> readSides(String fileName){
		ArrayList<Side> sideList = new ArrayList<Side>();
		String inputPath = fileName;

		try {
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Side s = new Side(temp[0], temp[1],Integer.parseInt(temp[2]));
					sideList.add(s);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}

			}
			br.close();
			fr.close();
		} 
		catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return sideList;
	}
	/*
	 * Method readSalads
	 * @param fileName String
	 * @return Salad ArrayList
	 */
	public static ArrayList<Salad> readSalads(String fileName){
		ArrayList<Salad> saladList = new ArrayList<Salad>();
		String inputPath = fileName;

		try {
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Salad sa = new Salad(temp[0], temp[1],Integer.parseInt(temp[2]));
					saladList.add(sa);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}

			}
			br.close();
			fr.close();
		} 
		catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return saladList;
	}
	/*
	 * Method readDesserts
	 * @param fileName String
	 * @return Dessert ArrayList
	 */
	public static ArrayList<Dessert> readDesserts(String fileName){
		ArrayList<Dessert> dessertList = new ArrayList<Dessert>();
		String inputPath = fileName;

		try {
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Dessert d = new Dessert(temp[0], temp[1],Integer.parseInt(temp[2]));
					dessertList.add(d);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}

			}
			br.close();
			fr.close();
		} 
		catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return dessertList;
	}
}
