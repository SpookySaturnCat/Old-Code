
public class Lab09Prob03Practice {

	public static void main(String[] args) {
		
		int difference, greaterThan30 = 0, lowSum = 0, highSum = 0, aboveAverageDays = 0;
		double averageLow = 0, averageHigh = 0;
		int[] highs = { 81, 69, 63, 70, 72, 75, 78, 79, 78, 81, 73 };
		int[] lows = { 61, 48, 40, 37, 39, 43, 51, 50, 48, 59, 58 };
		
		System.out.printf("Days greater than 30 degree difference:%n");
		
		int minLow = lows[0], maxHigh = highs[0];
		
		for (int i = 0; i < lows.length; i++) {
			
			difference = 0;
			
			difference = highs[i] - lows[i];
			
			if (difference > 30) {
				greaterThan30++;
				System.out.printf("Day %d:  %d%n", i, difference);
			}
			lowSum += lows[i];
			highSum += highs[i];
			
			if (minLow > lows[i]) {
				minLow = lows[i];
			}
			
			if (maxHigh < highs[i]) {
				maxHigh = highs[i];
			}
			
		}
		averageLow = lowSum / (double) lows.length;
		averageHigh = highSum / (double) highs.length;
		double averageDifference = averageHigh - averageLow;
		
		for (int i = 0; i < highs.length; i++) {
			
			difference = highs[i] - lows[i];
			if (averageDifference < difference) {
				
				aboveAverageDays++;
			}
		}
		System.out.printf("%nStatistics:%nMin Low: %d%nAverage Low: %.2f%n%nMax High: %d%nAverage High: %.2f%n%nAverage Difference: %.2f%nNumber of days with above-average difference: %d out of %d", minLow, averageLow, maxHigh, averageHigh, averageDifference, aboveAverageDays, highs.length);
		
		
		
	}
}
