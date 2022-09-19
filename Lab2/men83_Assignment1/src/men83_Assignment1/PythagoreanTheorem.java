package men83_Assignment1;
import javax.swing.JOptionPane;
public class PythagoreanTheorem {

	public static void main(String[] args) {
	//inputed #'s for triangle
		String numberInput1 =JOptionPane.showInputDialog("Input a number");
		Double number1=Double.parseDouble(numberInput1);
		String numberInput2= JOptionPane.showInputDialog("Input another number");
		Double number2 = Double.parseDouble(numberInput2);
	//hypotenuse
		double hyp = Math.sqrt((Math.pow(number1, 2))+(Math.pow(number2, 2)));
		hyp=(int)Math.round(hyp*100);
		hyp=hyp/100.0;
		System.out.println("The hypotenuse is "+ hyp +".");
	}

}
