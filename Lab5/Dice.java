package men83_lab5;

import java.util.Random;
import javax.swing.JOptionPane;
public class Dice {
	
	public static void main(String[] args) {
		
		Random v = new Random();
		int num;
		boolean go =true;
		String input = "";
		String input2 = "";
		while(go) {
			input = JOptionPane.showInputDialog("Enter the number of rolls desired: ");
			num = Integer.parseInt(input);
			RollDice(num,v);
			input2 = JOptionPane.showInputDialog("Do you want to continue, yes or no?");
			if(input2.equalsIgnoreCase("no")) {
				go=false;
			}
		}
	}

	public static void RollDice(int times, Random s) {

		int[] valueList = new int[11];
		int diceNum;
		for(int k=1; k<=times;k++) {
			diceNum= s.nextInt(5)+1;
			diceNum+= s.nextInt(5)+1;
			for(int i=1;i<=12;i++) {
				if(diceNum==i) {
					valueList[i-1]+=1;
				}
			}
		}
		System.out.println("Probability: ");
		for(int k=0; k<valueList.length;k++) {
			System.out.println(valueList[k]+"/"+times);
		}
	}
}
