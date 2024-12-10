
public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(12);
		Circle c2 = new Circle(17);
		
		System.out.printf("Area:\t\t%.2f%nPerimeter:\t%.2f%n"
				, c1.getArea(), c1.getPerimeter());
		
		System.out.printf("Area:\t\t%.2f%nPerimeter:\t%.2f%n"
				, c2.getArea(), c2.getPerimeter());
		
		// Change c1 value to 29
		System.out.printf("Area:\t\t%.2f", c1.getArea());
	}
}
