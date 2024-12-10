
public class October_18 {
	
	public static void main(String[] args) {
		
		String message = "General Kenobi";
		int numOfTimes = 10;
		
		printMessageNTimes(message, numOfTimes);
	}
	
	public static void printMessageNTimes(String message, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("%d: %s%n", i, message);
		}
	}
	
	
}
