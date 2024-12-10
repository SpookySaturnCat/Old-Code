
public class PAssign08_Practice {

	public static void main(String[] args) {

		// Initialize double variables
		double maintenceBeforeDonation = 0, incomeBeforeDonation = 0, maintenceAfterDonation = 0,
				incomeAfterDonation = 0, donatedIncome = 0;

		// Populate and declare arrays
		double[] maintence = { 21500, 29275, 37250, 35322, 19757, 24625, 30300, 18759, 15217, 27090, 12439, 22005 };
		double[] income = { 26752, 21421, 39759, 24783, 15297, 25264, 32159, 16157, 21705, 19420, 18275, 21350 };
		boolean[] keepOrDonate = new boolean[maintence.length];

		// For loop to populate boolean array and calculate totals
		for (int i = 0; i < income.length; i++) {

			// Run method to populate keepOrDonate
			keepOrDonate[i] = keepProperty(maintence[i], income[i]);

			// Calculate incomes before donation
			maintenceBeforeDonation += maintence[i];
			incomeBeforeDonation += income[i];

			// Checks to see if property was kept
			if (keepOrDonate[i] == true) {

				maintenceAfterDonation += maintence[i];
				incomeAfterDonation += income[i];
			} else { // Checks to see if property was donated

				donatedIncome += income[i];
			}
		}

		// Hell print statements
		System.out.printf("Total maintenance/renovation before donation: %,.2f", maintenceBeforeDonation);
		System.out.printf("%nTotal rental income before donation: %,.2f", incomeBeforeDonation);
		System.out.printf("%n%nTotal maintenance/renovation after donation: %,.2f", maintenceAfterDonation);
		System.out.printf("%nTotal rental income after donation: %,.2f", incomeAfterDonation);
		System.out.printf("%n%nTotal Donated Rental Income: %,.2f", donatedIncome);
		System.out.println("\n");

		// Print method
		printDecisions(keepOrDonate);
		System.out.println(); // If this went through gradescope she would want this

	}

	// Method to populate boolean array in main
	public static boolean keepProperty(double cost, double income) {

		// Initialize variables
		double costPrice = 0, incomePrice = 0;

		// Calculate given calculations
		costPrice = cost * 4.75;
		incomePrice = income * 10.25 / 2.0;

		// Determines status based on calculations
		if (costPrice < incomePrice) {
			return true;
		}

		// Returns false if above condition is not met
		return false;
	}

	public static void printDecisions(boolean[] choice) {

		// Initialize string
		String status = "";

		// Runs the entire length of array
		for (int i = 0; i < choice.length; i++) {

			// If else to change string name
			if (choice[i] == true) {
				status = "keep";
			} else {
				status = "donate";
			}
			// Prints results at the end of each loop
			System.out.printf("Property %d - %s%n", i, status);
		}
	}
}
