
public class Lab09Prob2Practice {
	 
	public static void main(String[] args) {
		double[] arr = {18.7, -22.2, 43.4, 74.1, -25.5, 46.6, 27.8};
		
		printArray(halfCopyArray(arr));
		
		}
	
	public static void printArray(double[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%.1f%n", arr[i]);
		}
		
	}
	
	public static double[] halfCopyArray(double[] arr) {
				
		double halfSize = arr.length / 2.0;
		double[] returnArr = new double[(int) Math.ceil(halfSize)];
		
		for (int i = 0; i < returnArr.length; i++) {
			returnArr[i] = arr[i];
		}
		
		
		
		return returnArr;
	}
}
