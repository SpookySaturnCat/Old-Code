

public class ShowCurrentTime {

	public static void main(String[] args) {
		
		//obtains the total millisecond since midnight, Jan 1, 1970
		double totalMilliseconds = (int) System.currentTimeMillis();
		double totalSeconds = totalMilliseconds / 1000;
		double currentSecond = (int) (totalSeconds % 60);
		double totalMinutes = totalSeconds / 60;
		double currentMinutes = (int) (totalMinutes % 60);
		double totalHours = totalMinutes /60;
		double currentHourRussia = (int) (totalHours % 24);
		double currentHourNewYork = (int) (currentHourRussia - 4);
		
		System.out.printf("Current time is %.0f:%.0f:%.0f%.2f", currentHourNewYork, currentMinutes, currentSecond,totalMilliseconds);
		System.out.println("Current time is " + currentHourNewYork + ":"
				+ currentMinutes + ":" + currentSecond + ":" + totalMilliseconds);
	}
}
