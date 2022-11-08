package men83_lab9;

public abstract class Person {
	private String name;
	private String address = "String";
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		address = a;
	}
	public void setName(String n) {
		name = n;
	}
}
