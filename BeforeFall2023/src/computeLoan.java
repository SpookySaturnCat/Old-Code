

import java.util.Scanner;

public class computeLoan {
	
	public static void main(String[] args) {
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//obtain yearly interest rate
		System.out.print("Enter yearly intrest rate, for example 5.25: ");
		double annualIntrestRate = input.nextDouble();
		
		//obtain monthly interest rate
		double monthlyIntrestRate = annualIntrestRate / 1200;
		
		//obtain number of years
		System.out.print("Enter number of years as integer, for example 5: ");
		int numOfYears = input.nextInt();
		
		//obtain loan amount
		System.out.print("Enter loan amount, for example 120000.95: ");
		double loanAmount = input.nextDouble();
		
		//calculate payments
		
		double monthlyPayment = loanAmount * monthlyIntrestRate / (1
				-1 /Math.pow(1 + monthlyIntrestRate, numOfYears * 12));
		
		double totalPayment = monthlyPayment * numOfYears * 12;
		 
		System.out.println("The monthly payment is " + 
		        (int) (monthlyPayment * 100) /  100.0);
		
		System.out.println("The total payment is " + 
		        (int) (totalPayment * 100) /  100.0);
		
	}

}
