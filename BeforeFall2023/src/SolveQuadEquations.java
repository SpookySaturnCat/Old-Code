//

import java.util.Scanner;
public class SolveQuadEquations {

	public static void main(String[] args) {
		
		//prompt user to enter values
		System.out.print("Enter a, b, c: ");
		//create scanner objects
		Scanner input = new Scanner(System.in);
		
		//create values that are assigned to user input
		double valueA = (double) input.nextInt();
		double valueB = (double) input.nextInt();
		double valueC = (double) input.nextInt();
		
		double discrimiminet = (-valueB - (Math.pow(valueB, 0.5)-4 * valueA * valueC) /2*valueA);
		
		if (discrimiminet == 0) {
			
			System.out.println("The equation had one root: " + discrimiminet);
		}

	}

}
