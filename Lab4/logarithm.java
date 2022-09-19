package men83_lab4;
import javax.swing.JOptionPane;
public class logarithm {

	public static void main(String[] args) {
		int base;
		int x;
		double quotient = 0;
		int count = 1;
		String input = JOptionPane.showInputDialog("Input a base: ");
		base = Integer.parseInt(input);
		if(base<1) {
			input = JOptionPane.showInputDialog("Enter a valid  base number: ");
			base = Integer.parseInt(input);
		}
		input = JOptionPane.showInputDialog("Input a value: ");
		x = Integer.parseInt(input);
		if(x<0) {
			input = JOptionPane.showInputDialog("Enter a valid number: ");
			x = Integer.parseInt(input);
		}
		quotient = x/base;
		while(quotient>=base) {
			quotient/=base;
			count++;
		}
		System.out.println(count);	
}

}
