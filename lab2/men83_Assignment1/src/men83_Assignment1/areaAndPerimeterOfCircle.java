package men83_Assignment1;
import javax.swing.JOptionPane;
public class areaAndPerimeterOfCircle {

	public static void main(String[] args) {
	//inputed radius
		String numberInput1 = JOptionPane.showInputDialog("Input a number");
		double r = Double.parseDouble(numberInput1);
	//perimeter & area
		double perimeter = 2*(Math.PI)*r;
		perimeter=(int)Math.round(perimeter*100);
		perimeter=perimeter/100.0;
		double area = (Math.PI)*Math.pow(r, 2);
		area=(int)Math.round(area*100);
		area=area/100.0;
		System.out.println("The circle with radius "+r+ " has an area of "+area+" and a perimeter of "+perimeter+".");
	}

}
