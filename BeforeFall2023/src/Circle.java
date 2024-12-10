
public class Circle {

	private double radius;
	
	public Circle() {
		radius = 0;
	}
	
	public Circle(double newRadius) {
		this.radius = newRadius;
	}
	double getArea() {
		return Math.PI * radius * radius;
	}
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
}
