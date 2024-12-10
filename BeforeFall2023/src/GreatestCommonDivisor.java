import java.util.Scanner;
public class GreatestCommonDivisor {

	//main method
	public static void main(String[] args) {

		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		System.out.print("The greatest common divisor for " + n1 
				+ " and " + n2 + " is " + gcd(n1,n2));
	}

	//return the gcd of two integers
	public static int gcd(int n1, int n2) {
		int gcd = 1; //initial gcd is one
		int k = 2; // possible gcd
		
		
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) 
				gcd = k;
			k++;
		}
		return gcd;
	}
}
