package men83_MenuManager_v4;
/*Class FileManager
 * @author: Morgan Noonan
 * created: 11/14/22
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager {
	/*
	 * Method readItems
	 * @param fileName String
	 * @return disList ArrayList
	 */
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> dishList = new ArrayList<MenuItem>();
		String inputPath = fileName;
		try {
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 5) {
					if(temp[1].equals("entree")) {
						Entree e = new Entree(temp[0], temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						dishList.add(e);
					}
					else if(temp[1].equals("side")){
						Side s = new Side(temp[0], temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						dishList.add(s);
					}
					else if(temp[1].equals("salad")) {
						Salad sa = new Salad(temp[0], temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						dishList.add(sa);
					}
					else if(temp[1].equals("dessert")) {
						Dessert d = new Dessert(temp[0], temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						dishList.add(d);
					}
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
		return dishList;
	}
	/*
	 * Method writeMenus
	 * @param  fileName String, menus ArrayList<Menu> 
	 */
	public static void writeMenus(String fileName, ArrayList<Menu> menus){
		String path = fileName;

		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			for( int k=0; k<menus.size();k++) {
				bw.write(menus.get(k).getName()+"@@"+menus.get(k).getEntree().getName()+"@@"+menus.get(k).getEntree().getDesc()+"@@"+menus.get(k).getEntree().getCal()+"@@"+menus.get(k).getEntree().getPrice()
						+"@@"+menus.get(k).getSide().getName()+"@@"+menus.get(k).getSide().getDesc()+"@@"+menus.get(k).getSide().getCal()+"@@"+menus.get(k).getSide().getPrice()
						+"@@"+menus.get(k).getSalad().getName()+"@@"+menus.get(k).getSalad().getDesc()+"@@"+menus.get(k).getSalad().getCal()+"@@"+menus.get(k).getSalad().getPrice()
						+"@@"+menus.get(k).getDessert().getName()+"@@"+menus.get(k).getDessert().getDesc()+"@@"+menus.get(k).getDessert().getCal()+"@@"+menus.get(k).getDessert().getPrice()
						+"\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/*
	 * Method deleteFileContent
	 * @param  fileName String 
	 */
	public static void deleteFileContent(String fileName) {
		String path = fileName;

		try {
			FileWriter fw = new FileWriter(path);
			PrintWriter bw = new PrintWriter(fw);
			bw.write("");
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
