
public class NewProb3 {
	public static void main(String[] args) {

		// Generate random number 0 -950 and constrain from 0-6
		int status = (int) (Math.random() * 951) % 7;

		double salary = 40000;

		double raise;
		// If else statement for cases
		if (status == 0) {
			raise = 0.0;
		} else if (status == 1) {
			raise = 3.7;
		} else if (status == 2) {
			raise = 4.2;
		} else if (status == 3) {
			raise = 5.7;
		} else if (status == 4) {
			raise = 6.1;
		} else if (status == 5) {
			raise = 7.3;
		} else {
			raise = 8.7;
		}

		double newSalary = salary + raise / 100 * salary;

		System.out.println("With a random status of " + status + " and an initial salary of " + salary
				+ ", your raise is " + raise + " which equates to a new salary of $42440.0.");
	}
}
