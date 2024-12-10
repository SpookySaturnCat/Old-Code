
public class PlayerSetUp {
	
public static String promptName() {
		
		System.out.print("Please enter your name: ");
		String userName = Test.input.nextLine();
		
		System.out.printf("%s, is that correct?%nEnter \"yes\" if you want to proceed: ", userName);
		String choice = Test.input.nextLine();
		
		if (choice.equalsIgnoreCase("yes")) {
			return userName;
		}
		
		return promptName();
		
	}
	public static void promptPronoun(Player user) {
		
		System.out.print("What are your pronouns?\n"
				+ "1. She/Her\n"
				+ "2. He/Him\n"
				+ "3. They/Them\n"
				+ "Enter the numeric value (ex: 1): ");
		int pronounChoice = Test.input.nextInt();

		switch(pronounChoice) {
		
		case 1: user.pronoun[0] = "she";
				user.pronoun[1] = "her";
				break;
		case 2: user.pronoun[0] = "he";
				user.pronoun[1] = "him";
				break;
		case 3: user.pronoun[0] = "they";
				user.pronoun[1] = "them";
				break;
			default:
				System.out.println("Invalid entry. Try again.\n");
				promptPronoun(user);
		}
}
}
