
public class Circle3 {
	
	private double radius = 1;
	
	private static int numberOfObjects = 0;
	
	public Circle3() {
		numberOfObjects++;
	}
	public Circle3(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		Circle3 c = new Circle3(40);
		Circle3.numberOfObjects = 50;
		System.out.println(Circle3.getNumberOfObjects());
		c.radius = -100;
	}

}
