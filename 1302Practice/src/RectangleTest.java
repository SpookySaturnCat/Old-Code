
public class RectangleTest {

	public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle(4, 4);
		Rectangle r2 = new Rectangle(2, 7);

		System.out.printf("R1 Area: %d%nR1 Perimeter: %d%n", r1.getArea(), r1.getPerimeter());
		System.out.printf("R2 Area: %d%nR2 Perimeter: %d%n", r2.getArea(), r2.getPerimeter());

		System.out.println("\nAfter changing values");
		r2.setHeight(18);
		r2.setWidth(9);
		System.out.printf("R2 Area: %d%nR2 Perimeter: %d%n", r2.getArea(), r2.getPerimeter());

	}
}
