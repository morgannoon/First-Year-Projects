package men83_lab9;

public class Circle {
 private double radius = 5.0;
 private String color = "Green";
 
 public Circle() {
	 
 }
 public Circle(double r) {
	 radius = r;
 }
 public Circle(double r, String c) {
	 radius = r;
	 color = c;
 }
 public double getRadius() { 
	 return radius;
 }
 public void setRadius(double r) {
	 radius = r;
 }
 public String getColor() {
	 return color;
 }
 public void setColor(String c) {
	 color = c;
 }
 public double getArea() {
	 return Math.PI*(Math.pow(radius,2));
 }
}
