
public class NestedFor {
	public static void main(String[] args) {

		// Outer loop
		for (int i = 0; i <= 12; i++) {
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
			// Inner loop
			for (int j = 0; j <= 12; j++) {
				System.out.printf("%4d   | ", i * j);
			}
			System.out.println();
		}
	}
}


