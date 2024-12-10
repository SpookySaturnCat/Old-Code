
public class NewProb01 {
	public static void main(String[] args) {

		// Generate random number 0-65 and create string variable
		int randomNumber = (int) (Math.random() * 66);
		String notStatus = "";

		// If statement
		if (randomNumber < 21) {
			notStatus = "not ";
		}
		// Print results
		System.out.println("You are " + randomNumber + " and " + notStatus + "able to buy alcohol.");
	}
}
