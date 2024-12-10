
public class Lab07Prob03 {
	public static void main(String[] args) {
		printApproximateCos(Math.PI / 6.0);
	}

	public static double factorial(int number) {


		double result = 1.0;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public static void printApproximateCos(double x) {
		
		double approxCos = 0;
		int numTerms = 7;
		double actualCosine = Math.cos(x);
		
		for (int i = 0; i <= numTerms; i++) {
			
			approxCos += (Math.pow(-1, i) / factorial(2 * i)) * Math.pow(x, 2*i);
		}
		System.out.printf("Actual Cos (PI/6): %.16f%n", actualCosine);
		System.out.printf("Approx Cos (PI/6): %.16f%n", approxCos);
	}
}
