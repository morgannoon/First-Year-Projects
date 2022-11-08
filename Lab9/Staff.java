package men83_lab9;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String n, String a, String s,double p) {
		setName(n);
		setAddress(a);
		school = s;
		pay = p;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String s) {
		school = s;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double p) {
		pay = p;
	}
	@Override
	public String toString() {
		return getName()+" "+getAddress()+" "+school+" "+pay;
	}
}
