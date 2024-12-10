
public class RunningSum {
	public static void main(String[] args) {
		
		int runningSum = 0;
		
		for (int i = 0; i <= 1000; i += 8) {
			System.out.println(i);
			runningSum += i;
		}
		
		System.out.printf("Running sum: %,d%n", runningSum);
	}
}
