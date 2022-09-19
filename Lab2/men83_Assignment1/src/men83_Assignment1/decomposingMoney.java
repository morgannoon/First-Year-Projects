package men83_Assignment1;
import javax.swing.JOptionPane;
public class decomposingMoney {

	public static void main(String[] args) {
	//input
		String input = JOptionPane.showInputDialog("Enter an amount of money between $1-$9999");
		int number = (int)Double.parseDouble(input);
	//bucks
		int bucks = number%10;
	//sawbucks
		int sawbucks = (number%100)/10;
	//benjamins
		int benjamins = (number%1000)/100;
	//grands
		int grands = number/1000;
	//output
		System.out.println(grands+" grands\n" +benjamins+" benjamins\n"+ sawbucks+ " sawbucks\n"+ bucks+ " bucks");
	}

}
