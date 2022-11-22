package men83_MenuManager_v3;
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
import java.util.ArrayList;

public class FileManager {
	/*
	 * Method readEntrees
	 * @param fileName String
	 * @return disList ArrayList
	 */
	public ArrayList<MenuItem> readItems(String fileName){
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
	public static void writeMenus(String fileName, ArrayList<Menu> menus){
		String path = fileName;

		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			for( int k=0; k<menus.size();k++) {
				//bw.write([k].);
			}
			// bw.write("Hello, my name is Dmitriy");


			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
