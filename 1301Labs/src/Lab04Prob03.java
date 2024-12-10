
public class Lab04Prob03 {

	public static void main(String[] args) {
		
		// Initialize and declare variables
		double initialSalary = 40000, raise, newSalary;
		int constrainedStatus, randomStatus = (int) ((Math.random() * 951));
	
		// Calculate constrained value
		constrainedStatus = randomStatus % 7;
		
		// Messy ass if else (what the lab wanted)
		if (constrainedStatus == 0) {
			raise = 0;
		} else if (constrainedStatus == 1) {
			raise = 3.7;
		} else if (constrainedStatus == 2) {
			raise = 4.2;
		} else if (constrainedStatus == 3) {
			raise = 5.7;
		} else if (constrainedStatus == 4) {
			raise = 6.1;
		} else if (constrainedStatus == 5){
			raise = 7.3;
		} else {
			raise = 8.7;
		}
		
		// Calculate the new salary
		newSalary = ((raise / 100) * initialSalary) + initialSalary;
		
		// Print results
		System.out.printf("With a random status of %d and an initial salary of $%.1f,"
				+ " your raise is %.1f%c which equates to a new salary of $%.1f"
				, constrainedStatus, initialSalary, raise, '%', newSalary);
	}
}
