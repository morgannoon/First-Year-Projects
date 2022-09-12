package men83_lab3;
import javax.swing.JOptionPane;
public class UnitConverter {

	public static void main(String[] args) {
	//input
		String input = JOptionPane.showInputDialog("Input a distance or a weight amount(cm/in/oz/gm/yd/m/lb/kg).");
		String converted = "";
		if(input==null || input.equalsIgnoreCase("")) {
			input = JOptionPane.showInputDialog("You must input a numeric value.");
		}
		String measurement = input.substring(input.length()-2);
		double number = Double.parseDouble(input.substring(0,input.length()-3));
;	//conversion
		if(measurement.equalsIgnoreCase("cm")) {
			number = Math.round((number/2.54)*100000.0)/100000.0;
			converted = number+ " in";
			}
		else if(measurement.equalsIgnoreCase("in")) {
			number = Math.round((number*2.54)*100000.0)/100000.0;
			converted = number+ " cm";
			}
		else if(measurement.equalsIgnoreCase("yd")) {
			number = Math.round((number/1.094)*100000.0)/100000.0;
			converted = number+ " m";
		}
		else if(measurement.equalsIgnoreCase("m")) {
			number = Math.round((number*1.094)*100000.0)/100000.0;
			converted = number+ " yd";
		}
		else if(measurement.equalsIgnoreCase("oz")) {
			number = Math.round((number*28.35)*100000.0)/100000.0;
			converted = number+ " gm";
		}
		else if(measurement.equalsIgnoreCase("gm")) {
			number = Math.round((number/28.35)*100000.0)/100000.0;
			converted = number+ " oz";
		}
		else if(measurement.equalsIgnoreCase("lb")) {
			number = Math.round((number/2.205)*100000.0)/100000.0;
			converted = number+ " kg";
		}
		else if(measurement.equalsIgnoreCase("kg")) {
			number = Math.round((number*2.205)*100000.0)/100000.0;
			converted = number+ " lb";
		}
		System.out.println(input+ " = "+ converted);
	}

}
