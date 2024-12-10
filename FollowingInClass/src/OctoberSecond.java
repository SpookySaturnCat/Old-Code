
public class OctoberSecond {
	public static void main(String[] args) {

		// Outer loop
		for (int i = 0; i < 3; i++) {
			System.out.println("Before loop\n");

			// Inner loop
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d | %d%n", i, j);
				System.out.println("Inside inner loop");
			}
			System.out.println("After loop");
		}
	}
}
