
public class RunninfProduct {
	public static void main(String[] args) {
		
		double runningProduct = 1;
		
		for (int i = 1; i <= 1000; i += 8) {
			System.out.println(i);
			runningProduct *= i;
		}
		System.out.printf("Running product: %,f%n", runningProduct);
	}
}
