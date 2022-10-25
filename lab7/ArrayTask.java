package men83_lab7;

import javax.swing.JOptionPane;
public class ArrayTask {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How many items?");
		int size = Integer.parseInt(input);
		double[] list = new double[size];
		for(int k = 0; k<list.length;k++) {
			list[k] = Math.round((Math.random()*99+1)*100.0)/100.0;
			System.out.println(list[k]);
		}
		
		System.out.println("max: " +max(list));
		System.out.println("min: " +min(list));
		System.out.println("sum: " +sum(list));
		System.out.println("ave: " +ave(list));
		
	}

	public static double max(double [] data) {
		double max = data[0];
		for(int k = 0;k<data.length;k++) {
			if(max<data[k]) {
				max = data[k];
			}
		}
		return max;
	}
	public static double min(double[]data) {
		double min = data[0];
		for(int k = 0;k<data.length;k++) {
			if(min>data[k]) {
				min = data[k];
			}
		}
		return min;
		
	}
	public static double sum(double[] data) {
		double sum=0;
		for(int k = 0;k<data.length;k++) {
			sum+=data[k];
		}
		return sum;
		
	}
	public static double ave(double[] data) {
		double sum = sum(data);
		return sum/data.length;
		
	}
}
