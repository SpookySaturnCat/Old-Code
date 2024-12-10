
public class AverageMethodInClass {
	public static void main(String[] args) {
		
		double average = averageThree(89.2, 77.9, 94.2);
		System.out.println(average);
	}
	
	public static double averageThree(double num1, double num2, double num3) {
		
		double average = 0.0;
		
		average = (num1 + num2 + num3) / 3.0;
		
		return average;
	}
}
