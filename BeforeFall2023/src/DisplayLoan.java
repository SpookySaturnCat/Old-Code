
public class DisplayLoan {
	public static void main(String[] args) {

		int numberOfYears;
		double loanAmount;
		double annualInterestRate;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter loan amount, for example 420.69: ");
		loanAmount = input.nextDouble();
		
		System.out.print("Enter number of years as an integer, \nfor example 5: ");
		numberOfYears = input.nextInt();
		
		System.out.print("Enter yearly intrest rate, for example 8.25: ");
		annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyRepayment = loanAmount * monthlyInterestRate / 
				(1 -(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears*12)));
		
		double balance = loanAmount;
		double interest;
		double principle;
		
		System.out.println("Loan amount: " + loanAmount);
		System.out.println("Number of years: " + numberOfYears);
		System.out.println("Interest rate: " + annualInterestRate + 
				"%");
		System.out.println();
		System.out.println("Monthly Payment: " + (int) (monthlyRepayment *100)/ 100.0);
		System.out.println("Total Payment: " + (int) (monthlyRepayment * 12 * numberOfYears * 100) / 100.0 + "\n");
		
		System.out.println("Payment#\tInterest\tPrinciple\tBalance\t");
		
		for (int i = 1; i <= numberOfYears*12;i++) {
			interest = (int) (monthlyInterestRate * balance * 100) / 100.0;
			principle = (int) ((monthlyRepayment - interest) *  100) / 100.0;
			balance = (int) ((balance - principle)* 100) / 100.0;
			System.out.println(i + "\t\t" + interest + "\t\t" + principle + "\t\t" + balance);
		}
		
		
		
	}
}
