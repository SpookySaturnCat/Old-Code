import java.util.Scanner;

public class Game {

	// create and name scanner object
	Scanner input = new Scanner(System.in);

	// variables that are not specific to one method
	int playerHP = 10;
	String playerWeapon;
	String playerName;
	int firstTavernChoice;
	Boolean playerLightSource;
	String playerCompanion;
	int salve;
	String playerArmor;
	Boolean optionOne = false;
	Boolean optionTwo = false;
	Boolean optionThree = false;

	// main method
	public static void main(String[] args) {

		// named game class method and assigns it the value of game class
		Game game = new Game();
		
		// calls playerSetUp and tavernBed method's
		game.playerSetUp();
		game.tavernBed();
	}

	// playerSetUp method
	public void playerSetUp() {

		// initial weapon value
		playerWeapon = "machete";

		System.out.println("Your HP: " + playerHP);
		System.out.println("Your weapon: " + playerWeapon);

		// prompt user
		System.out.print("Please enter your name: ");

		// assigns user input to playerName
		playerName = input.nextLine();

		System.out.print("Hello " + playerName + ", lets start your adventure.\n\n");

		// user enter + add line
		input.nextLine();
	}

	// method that checks HP after attack, either ends game or allows it to continue
	public void deadOrAlive() {
		if (playerHP < 0) {
			System.out.println("\nYOU DIED\n----------------------GAME OVER----------------------");
		} else {
			System.out.println("Your current HP is: " + playerHP);
		}
	}

	// tavernBed method; starts plot of game
	public void tavernBed() {

		// description texts
		System.out.print("-------You wake up in a small tavern bed-------\n");
		input.nextLine();
		System.out.print("Confused, you make your way downstairs.");
		input.nextLine();
		System.out.println("A woman and man are standing at the bar.");
		input.nextLine();

		// prompt user with choice
		System.out.println("What do you want to do?\n");
		input.nextLine();

		// three option choices
		System.out.println("1: Approach the strangers");
		System.out.println("2: Attack the strangers");
		System.out.println("3: Exit the Tavern\n");

		// user input is stored in firstTavernChoice variable
		firstTavernChoice = input.nextInt();

		if (firstTavernChoice == 1) { // if statement that gives dialog and starts the stayAtTavern method
			System.out.print("\nThe pair turn around to greet you.\n");
			input.nextLine();
			System.out.print("\nMan: Well it is good to see you're awake.");
			input.nextLine();
			System.out.print("Woman: Yeah you looked rough whenever he brought you in.");
			input.nextLine();
			System.out.print("You realize you have no memory beyond your name, and decide to sit down.\n");
			stayAtTavern();
		}
		// if else statement that gives dialog, lowers playerHP variable by one
		// and starts the stayAtTavern method
		else if (firstTavernChoice == 2) {
			playerHP -= 1;
			System.out.print(
					"\nYou sneak behind the man, but he turns before you can even reach your " + playerWeapon + ".\n");
			input.nextLine();
			System.out.print("\nMan: C'mon now stranger, no sense in attacking your rescuers.");
			input.nextLine();
			System.out.print("\n**The man pushes you into the seat rather forcefully**\n");
			input.nextLine();
			System.out.print("You take 1 damage\nYour current HP is: " + playerHP + "\n");
			stayAtTavern();
		} else if (firstTavernChoice == 3) {// else if statement that starts the leave tavern method
			leaveTavern();
		} else { // else statement that mocks user and restarts the tavernBed method
			System.out.println("\nYou fool! That isn't even an option.\nTry Again.\n\n");
			tavernBed();
		}
	}

	// method that runs if user enters 1 or 2 for firstTavernChoice
	public void stayAtTavern() {

		input.nextLine();
		System.out.print("Man: Well I am sure you want answers as to why you're here...");
		input.nextLine();
		System.out.print("Man: Unfortunately we are not the people to give you that information.");
		input.nextLine();
		System.out.print("Woman: But I can take you to them, come with me.");
		input.nextLine();
		System.out.print("With nothing else better to do, you follow the older woman outside the tavern.\n\n");
		input.nextLine();
		System.out.println("------------------Chapter 1: Who am I?------------------");
		input.nextLine();
		// run method
		chOneWomanCompanion();
	}

	// method that runs if user enters 3 for firstTavernChoice
	public void leaveTavern() {

		input.nextLine();
		System.out.print("You sneak out the back door undetected to find youself at the front "
				+ "of a small village.\nYou are taking in the sights of the village when suddenly...");
		input.nextLine();
		System.out.print("\nA young girl with pale skin and long black hair runs into you.");
		input.nextLine();
		System.out.print("She backs away from you and starts glaring condemingly");
		input.nextLine();
		System.out.print("\nGirl: You need to come with me.\n");
		input.nextLine();
		System.out.print("What do you want to do?\n");
		input.nextLine();
		System.out.println("1: Refuse");
		System.out.println("2: Follow her");

		// local int variable that determines dialog (leads to the same outcome)
		int followAna = input.nextInt();
		// user enter + add line
		input.nextLine();

		if (followAna == 1) { /*
								 * if statement that gives dialog to user, lowers HP by one and runs the
								 * chOneGirlCompanion method
								 */

			playerHP -= 2;// lower HP by 2

			System.out.print("You pull away from the girl and start to protest.");
			input.nextLine();
			System.out.print("Girl: Mother didn't give me a choice.");
			input.nextLine();
			System.out.print("\n**The girl grabs your wrist and twists it**");
			input.nextLine();
			System.out.print("You take two damage.\nYour current hp is: " + playerHP);
			input.nextLine();
			System.out.println("With seemingly little choice, the two of you start walking down the road.\n\n");
			input.nextLine();
			System.out.println("------------------Chapter 1: Who am I?------------------");
			input.nextLine();

			// runs the chOneGirlCompanion method
			chOneGirlCompanion();

		} else if (followAna == 2) {// else if statement that gives dialog to user and runs the ####### method

			System.out.print("You agree to follow the girl.");
			input.nextLine();
			System.out.print("You ask why she needs you to go with her.");
			input.nextLine();
			System.out.print("Girl: The Mother of Atoms has answers for you.");
			input.nextLine();
			System.out.println("Too confused to ask what that means, you both start walking down the road.\n\n");
			input.nextLine();
			System.out.println("------------------Chapter 1: Who am I?------------------");
			input.nextLine();
			// runs the chOneGirlCompanion method
			chOneGirlCompanion();

		} else {// else statement that mocks user and restarts the leaveTavern method

			System.out.println("\nYou fool! That isn't even an option.\nTry Again.\n\n");

			leaveTavern();
		}
	}

	/*
	 * at this point in the story regardless of choices, the player is with a
	 * companion and is on the way to go to the old mansion. The way the story
	 * follows is similar regardless of the companion, although they get more
	 * context for different things with each choice
	 */

	public void chOneWomanCompanion() {

		// assigns the playerCompainion variable if this method runs
		playerCompanion = "woman";
		// local choice variable;
		int choice;

		// dialog and line skips
		System.out.print("\nYou and the woman walk side by side through the middle the village.");
		input.nextLine();
		System.out.print("The streets are filled with people, merchants, and an unusual amount of lamp posts\n");
		input.nextLine();
		System.out.print("Woman: Hey, " + playerName + " I appreciate you coming along.");
		input.nextLine();
		System.out.print("Woman: Espically with a complete stranger...\n");
		input.nextLine();
		System.out.println("You notice the womans eyes are sunken deeply in the back of her face.");
		input.nextLine();
		System.out.print("You: When did I give you my name?");
		input.nextLine();
		System.out.print("\nThe woman stops mid stride and turns her body towards yours.");
		// dramatic pauses
		input.nextLine();
		System.out.println();
		input.nextLine();
		System.out.print("Woman: People in this town just tend to know things, " + playerName + ".");
		input.nextLine();
		System.out.print("Woman: It is nothing for you to concern yourself with.");
		// dramatic pauses
		input.nextLine();
		System.out.println();
		input.nextLine();
		System.out.print("The two of you start walking again, towards a small hidden area behind an abondon building.");
		input.nextLine();
		System.out.print("\nWoman: Before you worry I hope you know I have nothing to gain in harming you.");
		input.nextLine();
		System.out.print("The woman motion towards you to look in the hidden area.");
		input.nextLine();

		// prompts user
		System.out.println("\n\nWhat do you want to do?\n");
		System.out.println("1: Check it out");
		System.out.println("2: Refuse");

		// assigns user input to choice variable
		choice = input.nextInt();

		if (choice == 1) {
			// runs method
			chOneFindLight();
		} else if (choice == 2) {
			// runs method and skips chOneFindLight();
			chOneWomanCompainionPartTwo();

		}
		// this is just dumb
		else if (choice == 69) {
			chOneSecretWeapon();
			chOneWomanCompanion();
		} else {// else statement that mocks user and restarts the leaveTavern method
			System.out.println("\nYou fool! That isn't even an option.\nTry Again.\n\n");
			chOneWomanCompanion();
		}
	}

	// a dumb and pointless thing for hehe's
	public void chOneSecretWeapon() {
		playerWeapon = "The Sex Sword";

		System.out.print("You have recieved the " + playerWeapon + "\n");
		input.nextLine();
		System.out.println("x0.069 damage");
	}

	// if the user leaves the tavern and goes with the girl this is the next part
	public void chOneGirlCompanion() {
		// assigns girl to variable
		playerCompanion = "girl";
		// local variable
		int choice;
		// dialog
		input.nextLine();
		System.out.print("As the two of you continue down the road the Girl stops in front of an old building.");
		input.nextLine();
		System.out.print("Girl: There is a present for you behind that fence.");
		input.nextLine();
		System.out.print("Girl: You might need it later...");
		input.nextLine();

		// prompts user
		System.out.println("\n\nWhat do you want to do?\n");
		System.out.println("1: Check it out");
		System.out.println("2: Refuse");
		choice = input.nextInt();

		if (choice == 1) {
			// runs methods
			chOneFindLight();
		} else if (choice == 2) {
			// runs method and skips chOneFindLight();
			chOneGirlCompainionPartTwo();
		} else {// else statement that mocks user and restarts the leaveTavern method
			System.out.println("\nYou fool! That isn't even an option.\nTry Again.\n\n");
			chOneGirlCompanion();
		}
	}

	// runs for companions choices, and only runs if user looks behind the hole
	public void chOneFindLight() {
		// assign boolean variable as true for later part of game
		playerLightSource = true;
		// dialog and line skips
		input.nextLine();
		System.out.print("\nYou walk towards the hidden area and notice a large hole in the fence.");
		input.nextLine();
		System.out.print(
				"Assuming that is what the " + playerCompanion + " wanted you to check out, you crawl through.\n");
		input.nextLine();
		System.out.print("On the other side of the hole you see a dark lanscape with bountful flora.");
		input.nextLine();
		System.out.print("To your left you notice a faint glow coming from inside a bush.\n");
		input.nextLine();
		System.out.print("You look inside the bush.");
		input.nextLine();
		System.out.print("\n**You have obtained: lantern**");
		input.nextLine();
		System.out.print(
				"\nAssuming this is what she wanted you to find, you head back towards the " + playerCompanion + ".");

		// if else statement to guide player to correct method based on the choices they
		// have made previously
		if (playerCompanion == "girl") {
			chOneGirlCompainionPartTwo();
		} else {
			chOneWomanCompainionPartTwo();
		}
	}

	// Picks up after the light method, or if they refuse to go through and skip
	// that part
	public void chOneWomanCompainionPartTwo() {

		// local choice variable
		int choice;

		// dialog
		System.out.print("\n\nThe two of you continue walking along the cobblestone path.\n");
		input.nextLine();
		System.out.print("While walking towards the unknown destination you feel a cool breeze.");
		input.nextLine();
		System.out.print("\nWoman: I am assuming you have no memory of your life before today?");
		input.nextLine();

		// prompts user
		System.out.println("\nHow will you respond?\n");
		System.out.println("1: I do not");
		System.out.println("2: My memory is fine");
		choice = input.nextInt();

		// just lore in these if else statements
		if (choice == 1) {
			System.out.print("\nWoman: I figured, you're not the first this has happened to.");
			input.nextLine();
			System.out.print("\nWoman: I can't say I even fully know why or how..");
			input.nextLine();
			System.out.print("Woman: All I know is it started happening when they started emerging..");
			input.nextLine();
			System.out.print("The two of kept walking until you reach a large gated house.");
			input.nextLine();
			System.out.print("Woman: Well were here, so I will let her explain the rest.");
			input.nextLine();
		} else if (choice == 2) {
			System.out.print("\nWoman: You and I both know that's not true.");
			input.nextLine();
			System.out.print("\nThe two of kept walking until you reach a large gated house.");
			input.nextLine();
			System.out.print("Woman: Well were here, so I will let her explain.");
			input.nextLine();
		}

		else {
			chOneWomanCompainionPartTwo();
		}
		// regardless of choice this method will run after if else statement
		chapterTwoUniversal();
	}

	// has to have new method in here
	public void chOneGirlCompainionPartTwo() {

		// dialog
		System.out.print("\n\nThe two of you continue walking along the cobblestone path.");
		input.nextLine();
		System.out.print("While walking towards the unknown destination you feel a cool breeze.");
		input.nextLine();
		// yes, this is a legend of zelda reference merged with another reference to my
		// cat
		System.out.print("\nGirl: Do you know why Kikiro Village has so many lamp posts?");
		input.nextLine();
		System.out.print("\nYou shake your head no and start to notice just how many lights there are.");
		input.nextLine();
		System.out.print("\nGirl: I don't know either.");
		input.nextLine();
		System.out.print("Girl: They won't tell me because I am too young.");
		input.nextLine();
		System.out.print("Girl: Maybe she will tell you, espically since you don't know who you are. ");
		input.nextLine();
		System.out.print("\nYou realize you have no memory beyond todays events and your name.");
		// dramatic pause
		input.nextLine();
		System.out.println("");
		input.nextLine();
		System.out.print("You start to feel slightly uncomfortable.");
		input.nextLine();
		System.out.print("The two of you continue walking until you reach a large gated house.");
		input.nextLine();
		System.out.print("\nGirl: We're here " + playerName + ".");
		input.nextLine();
		System.out.print("Girl: Have fun.");
		input.nextLine();

		// run next method
		chapterTwoUniversal();
	}

	// no matter what choices were made, this method will run
	public void chapterTwoUniversal() {
		// local int variable
		int sitOrSnoop;

		// dialog
		input.nextLine();
		System.out.println("\n----------------------Chapter 2: Questions and Answers----------------------");
		input.nextLine();
		System.out.print("You part ways from the " + playerCompanion + " and examine the house in front of you.");
		input.nextLine();
		System.out.print("\nThe house is large in size, boasting an impressive stairway towards the entrence.");
		input.nextLine();
		System.out.print("There are multiple lanterns hanging from the top of the porch and across the lawn.");
		input.nextLine();
		System.out.print("You notice the lanterns have unfamiliar squiggly lines marked across them.");
		input.nextLine();
		System.out.print("\nYou make your way up the stairs to knock on the door, but before you are able to-");
		input.nextLine();
		System.out.print("\nVoice: Do come in.");
		input.nextLine();
		System.out.print("\nThe door flies open and the aroma of cinnamon hits you from inside.");
		input.nextLine();
		System.out.print("The floors creek from undernearth you as you enter the building.");
		input.nextLine();
		System.out.print("A short woman covered in golden jewlery makes her way into frame.");
		input.nextLine();
		System.out.print("\nShort Woman: You have finally arrived, go and sit down while I us get some tea.");
		input.nextLine();
		System.out.print("The short woman motions you towards some chairs in a living area.");
		input.nextLine();
		// prompt user
		System.out.println("\nWhat do you want to do?\n");
		System.out.println("1: Sit down");
		System.out.println("2: Snoop around");
		sitOrSnoop = input.nextInt();

		// if else statements based on sitOrSnoop variable
		if (sitOrSnoop == 1) {
			System.out.print("\nYou make you way to the chairs, sit down, and wait for the short woman.");
			input.nextLine();
			System.out.print("\nWhile waiting you notice the decor is quite unusal.");
			input.nextLine();
			System.out.print("There are bottles and vials fillied with unknown substances strown everywhere.");
			input.nextLine();
			System.out.print("Along with numerous tables filled with strange drawings and machinery.");
			input.nextLine();

			// run next method
			chapterTwoCamillaSpeech();

		} else if (sitOrSnoop == 2) {
			System.out.print("\nYou make your way towards the chairs and look around the room.");
			input.nextLine();
			System.out.print("\nThere are numerous tables filled with strange drawings and machinery.");
			input.nextLine();
			System.out.print("Along with plentful bottles and vials filled with unknwon substances.");
			input.nextLine();
			System.out.print("\nYou invesitgate one of the tables and notice a frightful drawing lying there.");
			input.nextLine();
			System.out.print("It is of a humaonid creature, large and skinny, covered in long bandages.");
			input.nextLine();
			System.out.print("Feeling even more uncomfortable, you sit and wait for the short woman.");
			input.nextLine();

			// run next method
			chapterTwoCamillaSpeech();

		} else {
			System.out.println("\nYou fool! That isn't even an option.\nTry Again.\n\n");
			chapterTwoUniversal();
		}
	}

	public void chapterTwoCamillaSpeech() {
		// local int variable
		int choice;
		// dialog
		System.out.print("\nShe rushes back with two cups on a tray.");
		input.nextLine();
		System.out.print("\nShort Woman: Please do ignore the mess, we have been very busy as of recentley.");
		input.nextLine();
		System.out.print("Short Woman: How rude of me! My name is Camilla.");
		input.nextLine();
		System.out.print(
				"Camilla: I would ask for your name, " + playerName + ", but obviously, I am already aware of it.");
		input.nextLine();
		System.out.print("\nYou sit there confused, still feeling uncomfortable about the situation.");
		input.nextLine();
		System.out.print("\nCamilla: I know you must be very confused, I would be too.");
		input.nextLine();
		System.out.print("Camilla: So let me introduce myself formally..");
		input.nextLine();
		System.out.print("Camilla: My name is Camilla Bestow, I am known as the Mother of Atoms.");
		input.nextLine();
		System.out.print("Camilla: I am the leader of an organization called The Children of The Hollow.");
		input.nextLine();
		System.out.print("Camilla: Our mission is to discover the secrets of The Great Explosion.");
		input.nextLine();
		System.out.print("Camilla: And end the suffering it has caused.");
		input.nextLine();
		System.out.print("Camilla: " + playerName + ", I know this is a lot to take in...");
		input.nextLine();
		System.out.print("Camilla: Especially with your recent memory loss.");
		input.nextLine();
		System.out.print("Camilla: But you used to be an amazing warrior. Known throughout lands.");
		input.nextLine();
		System.out.print("Camilla: Yes, your current strength is low...");
		input.nextLine();
		System.out.print(
				"Camilla: But with proper preperations and training, you are the key " + "to fixing everything.");
		input.nextLine();
		System.out.print("Camilla: Warrior, please offer The Children of The Hollow your services.");
		input.nextLine();
		System.out.print("Camilla: If we work together, we will be able to save more than the village.");
		input.nextLine();
		System.out.print("Camilla: What do you say? Can we depend on you?");
		input.nextLine();

		// prompt user
		System.out.println("\nWhat do you want to do?\n");
		System.out.println("1: Help Camilla");
		System.out.println("2: Refuse");
		choice = input.nextInt();

		if (choice == 1) {
			// run next method
			chapterTwoHelpCamilla();
		} else if (choice == 2) {
			// local int variable to make sure user is sure
			int areYouSure;
			// prompt user to make sure they are sure
			System.out.println("\nAre you sure?\n");
			System.out.println("1: Yes");
			System.out.println("2: No");
			areYouSure = input.nextInt();
			// if statement that runs method
			if (areYouSure == 1) {
				chapterTwoRefuseToHelp();
			}
			// else if statement that runs method
			else if (areYouSure == 2) {
				chapterTwoCamillaSpeech();
			}
			// else method that restarts method
			else {
				// mocks user
				System.out.println("\nYou fool! That isn't even an option.\nTry Again.\n\n");
				chapterTwoCamillaSpeech();
			}
		} else {
			// mocks user
			System.out.println("\nYou fool! That isn't even an option.\nTry Again.\n\n");
			chapterTwoCamillaSpeech();
		}

	}

	// Chapter 2 main option 2
	public void chapterTwoRefuseToHelp() {
		System.out.print("\nYou refused to help Camilla");
		input.nextLine();
		System.out.print("\nCamilla: Warrior, I wish you well.");
		input.nextLine();
		System.out.print("Camilla: Although I don't see it going that way for you..");
		input.nextLine();
		System.out.print("\nYou exit the house quickly.");
		input.nextLine();
		System.out.print("As you make your way down the stairs you hear your name.");
		input.nextLine();
		System.out.print("\nWhisper: " + playerName + ", come over here.");
		input.nextLine();
		System.out.print("Whisper: Don't go to the town square.");
		input.nextLine();

		chapterTwoWhereToGo();
	}

	// choice method
	public void chapterTwoWhereToGo() {
		// local variable
		int choice;
		System.out.println("\nWhat do you want to do?\n");
		System.out.println("1: Follow the whisper");
		System.out.println("2: Explore town square");
		choice = input.nextInt();

		if (choice == 1) {
			chapterTwoFollowWhisper();
		} else if (choice == 2) {
			chapterTwoExploreTownSquare();
		} else {
			System.out.println("Now you know that's not an option....\nTry Again!\n");
			chapterTwoWhereToGo();
		}
	}

	// a method that kills you
	public void chapterTwoFollowWhisper() {
		System.out.print("\nYou start to follow the whisper.");
		input.nextLine();
		System.out.print("\nWhisper: You're getting closer.");
		input.nextLine();
		System.out.print("\nYou turn down multiple streets following the voice.");
		input.nextLine();
		System.out.print("\nWhisper: Almost here...");
		input.nextLine();
		System.out.print("Whisper: I have the answers you seek.");
		input.nextLine();
		System.out.print(
				"\nYour speed picks up and you continue seeking the voice until you are physically ontop of it.");
		input.nextLine();
		System.out.print("You look at your surroundings and notice you are in a graveyard.");
		input.nextLine();
		System.out.print("Underneath you is an unmarked grave.");
		input.nextLine();
		System.out.print("\nWhisper: You're here!");
		input.nextLine();
		System.out.print("\nYou jump off the grave as you feel it moving beneath you.");
		input.nextLine();
		System.out.print("The soil shakes until a deformed womans body slowly rises from the ground.");
		input.nextLine();
		System.out.print("\nWoman: The world is ours for the taking.");
		input.nextLine();
		System.out.print("She cracks her neck and lunges at you quickly.");
		input.nextLine();
		System.out.print("\n**The woman beats the literal shit out of you and runs away.**");
		input.nextLine();
		System.out.print("**-20 HP**");
		playerHP -= 20;
		input.nextLine();
		// basically tells u game is over at this point
		deadOrAlive();

	}

	public void chapterTwoExploreTownSquare() {
		int choice;
		System.out.print("\nIgnoring the whisper, you head towards the town square.");
		input.nextLine();
		System.out.print("\nYou hear the sounds of the whisper fade out as you enter the square.");
		input.nextLine();
		System.out.print("The center is filled with people and vendors alike.");
		input.nextLine();
		System.out.print("As you walk around and take in the sights a man approaches you.");
		input.nextLine();
		System.out.print("\nMan: Excuse me, but are you " + playerName + "?");
		input.nextLine();
		// run question method
		chapterTwoTownSquareQuestion();
		input.nextLine();
		choice = input.nextInt();
		if (choice == 1) {
			System.out.print("\n");
			input.nextLine();
			System.out.print("Man: Perfect! Come with me.");
			input.nextLine();
			System.out.print("\nThe man grabs your arm and drags you to the fountain center of the town square.");
			chapterTwoManInTownSquare();
		} else if (choice == 2) {
			System.out.print("\n");
			input.nextLine();
			System.out.print("Man: You lie to me!?!");
			input.nextLine();
			System.out.print("\nThe man punched you in the chest.");
			input.nextLine();
			System.out.print("**-20 HP**\n");
			playerHP -= 20;
			// basically tells you that the game is over at this point
			deadOrAlive();
		} else if (choice == 3) {
			System.out.print("\n");
			input.nextLine();
			System.out.print("Man: If I didn't know better I would think that you are messing with me.");
			input.nextLine();
			System.out.print("Man: No bother, anyways you need to come with me.");
			input.nextLine();
			System.out.print("\nThe man grabs your arm and drags you to the fountain center of the town square.");
			chapterTwoManInTownSquare();
		} else {
			System.out.print("\nYou fool! \nThat's not even an option!\nTry again!!");
			input.nextLine();
			chapterTwoTownSquareQuestion();
		}
	}

	public void chapterTwoTownSquareQuestion() {
		System.out.print("\nHow do you want to reply?\n");
		System.out.print("\n1. Yes I am");
		System.out.print("\n2. No I am not");
		System.out.print("\n3. What are you even going on about?");
	}

	public void chapterTwoManInTownSquare() {
		System.out.print("\n\nThe man and you are standig in front of the fountain.");
		input.nextLine();
		System.out.print("He starts waving his arms to flag over people shopping nearby.");
		input.nextLine();
		System.out.print("\nMan: Listen hear people of young and old, an important message is about the be shared.");
		input.nextLine();
		System.out.print("\nThe man repeats this phrase until a large crowd forms around the two of you.");
		input.nextLine();
		System.out.print("\n\nMan: The people of Kikioro have been in fear for much of time.");
		input.nextLine();
		System.out.print("Man: And those vile creatures are coming closer to our homes, threating us more.");
		input.nextLine();
		System.out.print("Man: We even have reports of something strange in the cemetery.");
		input.nextLine();
		System.out.print("Man: I say we all team up to handle this once and for all.");
		input.nextLine();
		System.out.print("Man: With " + playerName + " here I am sure that we can do it.");
		input.nextLine();
		System.out.print("Man: So what do we say?\n");
		input.nextLine();
		System.out.println("The crowd turns to you and awaits your answer.");

		chapterTwoFightQuestion();

	}

	public void chapterTwoFightQuestion() {
		int choice = input.nextInt();
		System.out.print("\nWhat do you want to do?");
		System.out.print("\n1. Help fight");
		System.out.println("\n2. Refuse to fight");

		if (choice == 1) {
			chapterTwoFightAgree();
		}

		else if (choice == 2) {
			chapterTwoFightRefuse();
		}

		else {
			System.out.print("You fool! \nThat isn't even an option! \nTry again!");
		}
	}

	public void chapterTwoFightAgree() {
		System.out.print("\nYou agree to fight with the towns people.");
		input.nextLine();
		System.out.print("\nThe towns people cheer triumphently.");
		input.nextLine();
		System.out.print("Man: Folks, gather your weapons and we meet here at dusk.");
	}

	public void chapterTwoFightRefuse() {

	}

	// Chapter 2 main option 1
	public void chapterTwoHelpCamilla() {
		System.out.print("\nYou agree to help, and offer your services to The Children of The Hollow.\n");
		input.nextLine();
		System.out.print("\nCamilla: Thank you so much, I wish I could sit here and "
				+ "thank you further, but we have things to do.");
		input.nextLine();
		System.out.print("Camilla: We will be having a meeting later tonight and will discuss things further.");
		input.nextLine();
		System.out.print("Camilla: For now I need you to collect yourself some essentials.");
		input.nextLine();
		System.out.print("Camilla: Go to out in town and get yourself these items.");
		input.nextLine();
		System.out.print("\nShe hands you a list.");
		input.nextLine();
		System.out.print("\n**You have obtained: shopping list**\n");
		input.nextLine();
		System.out.print("Camilla: Just tell them to put it on my tab.");
		input.nextLine();
		System.out.print("\nYou make your way out the house with list in hand.");
		input.nextLine();

		// run next method
		camillasShoppingList();
		// runs next method
		gatheringSupplies();
		System.out.println("\n\nYou got all of the supplies!!");
		input.nextLine();
		// run next method
		finishedSupplies();
	}

	// Separate method so things loop properly
	public void camillasShoppingList() {
		System.out.println("\n----------------------Camilla's List----------------------");
		System.out.println("Don't come back to me until you get all of these items.");
		System.out.println("\n1: Healing salve");
		System.out.println("2: Sword");
		System.out.println("3: Armor");
		System.out.println("\n----------------------------------------------------------");
	}

	public void gatheringSupplies() {
		// local variables for if else statement to complete method loop
		boolean healingSalve = false;
		boolean sword = false;
		boolean armor = false;
		int choice;
		while (healingSalve == false || sword == false || armor == false) {
			// prompt user
			input.nextLine();
			System.out.print("\nAfter looking at the list, what do you want to do?");
			input.nextLine();
			System.out.println("1: Find Salve");
			System.out.println("2: Find Sword");
			System.out.println("3: Find Armor");
			choice = input.nextInt();

			// conditionals that help the user complete loop
			if (choice == 1 && healingSalve == false) {

				// dialog
				System.out.print("\nYou walk along the streets looking for a shop that would sell healing salve.");
				input.nextLine();
				System.out.print("\nWhile walking you see an herbalists shop advertising salves.");
				input.nextLine();
				System.out.print("You make your way inside the quirky store.");
				input.nextLine();
				System.out.print("\nShopkeeper: Hello there, now there's an unfamiliar face!");
				input.nextLine();
				System.out.print("Shopkeeper: What can I do for you?");
				input.nextLine();
				System.out.print("\nYou explain that you are looking for healing salve.");
				input.nextLine();
				System.out.print("\nShopkeeper: Well you are in the right spot.");
				input.nextLine();
				System.out.print("Shopkeeper: Come here and tell me if this is what you're looking for.");
				input.nextLine();
				System.out.print("\nYou walk towards the shopkeeper and he takes your hand.");
				input.nextLine();
				System.out.print("He rubs some of the salve on you and you instanly feel the effects.");
				input.nextLine();
				System.out.print("\n+2 HP");
				// raise HP by two
				playerHP += 2;
				input.nextLine();
				System.out.print("Current HP is: " + playerHP + ".\n");
				input.nextLine();
				System.out.print("Shopkeeper: I'll bag you up a few for you.");
				input.nextLine();
				System.out.print("\n**You recieved: Healing Salve x3**\n");
				// salve value is three
				salve = 3;
				System.out.println("\nYou thank the Shopkeeper and make your way back outside.");
				// set boolean value as true
				healingSalve = true;
			} else if (choice == 1 && healingSalve == true) {
				System.out.println("You already collected that!\nTry Again!\n");
			} else if (choice == 2 && sword == false) {

				// dialog
				System.out.print("\nYou start looking for a place that sells swords");
				input.nextLine();
				System.out.print("\nRealizing nothing is popping out to you, you ask a man for directions.");
				input.nextLine();
				System.out.print("\nMan: A sword?! Well shouldn't you know better than me " + playerName + "?");
				input.nextLine();
				System.out.print("Man: Go towards the town square and make a left at the fountain.");
				input.nextLine();
				System.out.print("Man: There is a blacksmith in one of the buildings over there, it has a blue sign.");
				input.nextLine();
				System.out.print("\nYou thank the man and make your way towards the blacksmith.");
				input.nextLine();
				System.out.print("The blacksmith's shop was right the man said it would be and you go inside.");
				input.nextLine();
				/*
				 * Brittany this one is for u I also included a skyrim joke I am SORRY
				 */
				System.out.print("\nShopkeeper: Welcome to Tuggle's Smithery. Tuggle's has wares, if you have coin. ");
				input.nextLine();
				System.out.print("\nYou ask the shopkeeper to see the weapons and swords.");
				input.nextLine();
				System.out.print("\nShopkeeper: We have a few for sale now, although we mainly work off commisions. ");
				input.nextLine();
				System.out.print("Shopkeeper: Let me seee....We have a longsword, a curved sword, and a dao.");
				input.nextLine();
				System.out.print("Shopkeeper: All are made of iron, and cost the same.");
				input.nextLine();

				// run method
				chapterTwoSwordChoice();

				// dialog
				System.out.println(
						"\nShopkeeper: Great choice! The " + playerWeapon + " was always one of my favorites.");
				input.nextLine();
				System.out.println("You thank the Shopkeeper and make your way back outside.");

				// set sword boolean to true
				sword = true;
			} else if (choice == 2 && sword == true) {
				System.out.println("You already collected that!\nTry Again!\n");
			} else if (choice == 3 && armor == false) {

				// dialog
				System.out.println("\nYou decide to find some armor.");
				input.nextLine();
				System.out.print("While walking around the town square you notice a sign that reads as follows:");
				input.nextLine();
				// run method
				chapterTwoTownSquareSign();
				input.nextLine();
				System.out.print("The last line seems to be smudged out.");
				input.nextLine();
				System.out.print("\nYou continue walking until you reach a general store.");
				input.nextLine();
				System.out.print("Once inside you notice there are a lot of people browsing and talking.");
				input.nextLine();
				System.out.print("You make your way over to the armor when a man taps your shoulder.");
				input.nextLine();
				System.out.print("\nMan: Excuse me, if you're looking for armor I wouldn't advise shopping here.");
				input.nextLine();
				System.out.print("Man: This place is good for certain items, not armor.");
				input.nextLine();
				System.out.print("Man: I can take you to Brynn's Armourery if you would like.");
				input.nextLine();
				chapterTwoArmorChoice();
				armor = true;
			} else if (choice == 3 && armor == true) {
				System.out.println("You already collected that!\nTry Again!\n");
			} else {
				System.out.println("Now you know that's not an option....\nTry Again!\n");
				gatheringSupplies();
			}

		}
	}

	public void chapterTwoSwordChoice() {
		// local variable
		int swordChoice;
		// prompt user
		System.out.print("\nWhich weapon do you want?");
		input.nextLine();
		System.out.println("1: Longsword");
		System.out.println("2: Curved Sword");
		System.out.println("3: Dao");
		swordChoice = input.nextInt();
		if (swordChoice == 1) {
			System.out.println("**You have recieved: Longsword**");
			playerWeapon = "longsword";
		} else if (swordChoice == 2) {
			System.out.println("**You have recieved: Curved Sword**");
			playerWeapon = "curved sword";
		} else if (swordChoice == 3) {
			System.out.println("**You have recieved: Dao**");
			playerWeapon = "dao";
		} else {
			chapterTwoSwordChoice();
		}
	}

	public void chapterTwoTownSquareSign() {
		System.out.println("\n------------------------------------------------------------------------------\n");
		System.out.println("         The village of Kikioro has a rich history of over 5,000 years.");
		System.out.println("         Although, most of that history was lost to The Great Explosion.");
		System.out.println("         The village still stands strong, with a future of similar fate.");
		System.out.println("                           Arise now, ye Warrior.");
		System.out.println("               ## ##### ##### ###### t# ## ###### ## ### #######");
		System.out.println("\n------------------------------------------------------------------------------\n");
	}

	public void chapterTwoArmorChoice() {
		int brynnOrGeneral;
		System.out.print("\nWhat do you want to do?");
		input.nextLine();
		System.out.println("1: Accept");
		System.out.println("2: Deny");
		brynnOrGeneral = input.nextInt();
		if (brynnOrGeneral == 1) {
			chapterTwoBrynnsArmory();
		} else if (brynnOrGeneral == 2) {
			System.out.print("You deny the mans request.");
			input.nextLine();
			chapterTwoGeneralStore();
		} else {
			System.out.println("\nYou fool!\nThat's not even a choice!\nTry again!");
			chapterTwoArmorChoice();
		}
	}

	public void chapterTwoBrynnsArmory() {
		System.out.print("\nYou agree to go check out the armory and exit the general store.");
		input.nextLine();
		System.out.print("\nThe walk is short and the man leads you inside.");
		input.nextLine();
		System.out.print("He gets behind the counter and greets you.");
		input.nextLine();
		System.out.print("\nMan: Hello and welcome to Brynn's armory.");
		input.nextLine();
		System.out.print("You stare at the man blankly.");
		input.nextLine();
		System.out.print("\nMan: I know it may look off but, I meant what I said back there.");
		input.nextLine();
		System.out.print("Man: So, you could head back there and get you some of that cheap chainlink shit.");
		input.nextLine();
		System.out.print("Man: Or come to a true artisian like myself and get premium leather armor.");
		input.nextLine();
		System.out.print("Man: So what will it be?");
		input.nextLine();
		int brynnOrGeneral;
		System.out.print("\nWhat do you want to do?");
		input.nextLine();
		System.out.println("1: Stay");
		System.out.println("2: Return");
		brynnOrGeneral = input.nextInt();
		if (brynnOrGeneral == 1) {
			System.out.print("\nMan: Great choice!");
			input.nextLine();
			System.out.print("\nMan: Here you are, a fine new set of leather armor.");
			input.nextLine();
			System.out.print("\n**You have recieved: Leather Armor**");
			input.nextLine();
			playerArmor = "leather";
		} else if (brynnOrGeneral == 2) {
			System.out.print("\nMan: Can't win them all I guess.");
			input.nextLine();
			System.out.print("You head back inside the General Store");
			chapterTwoGeneralStore();
		} else {
			System.out.println("\nYou fool!\nThat's not even a choice!\nTry again!");
			chapterTwoBrynnsArmory();
		}
	}

	public void chapterTwoGeneralStore() {
		System.out.print("\nYou make your up to the counter and ask the Shopkeeper about the armor selection");
		input.nextLine();
		System.out.print("\nShopkeeper: All we have is this chainlink armor, I'll bag it up for you.");
		input.nextLine();
		System.out.print("\n**You have recieved: Chainlink Armor**");
		input.nextLine();
		playerArmor = "chainlink armor";
	}

	public void finishedSupplies() {
		System.out.print("\n" + "You make your way back to Camilla's house with supplies in hand.");
		input.nextLine();
		System.out.print("As you walk up the stairs to the front door you hear loud chattering inside.");
		input.nextLine();
		System.out.print(
				"The front door bursts open similarly to how it did before and you are greeted by multiple people.");
		input.nextLine();
		System.out.print("Camilla: Okay everyone back off and let " + playerName + " get inside.");
		input.nextLine();
		System.out.print("You eneter the house once again and notice the " + playerCompanion + " is also inside.");
		input.nextLine();

		if (playerCompanion == "girl") {
			chapterTwoGirlCompanion();
		} else {
			chapterTwoWomanCompanion();
		}
		// line break
		input.nextLine();
		chapterTwoChildrenOfTheHollowMeeting();
		// run next method

	}

	public void chapterTwoGirlCompanion() {
		System.out.print("\nGirl: Hello, " + playerName + " I am glad you are working with us.");
		input.nextLine();
		System.out.print("Girl: I think you have a better shot than the ones who tried before you.");
		input.nextLine();
		System.out.print("\nCamilla: Okay Ana, that is enough.");
		input.nextLine();
		System.out.print("Camilla: Everyone let's just start this meeting.");
		input.nextLine();
		System.out.print("You and the girl join the group in a seperate room.");
		input.nextLine();
		// You know her name now!!
		playerCompanion = "Ana";
	}

	public void chapterTwoWomanCompanion() {
		System.out.print("\nWoman: Hello, " + playerName + " I am glad you are working with us.");
		input.nextLine();
		System.out.print("Woman: Once we start the meeting, things will make more sense.");
		input.nextLine();
		System.out.print("\nAs if on cue, Camilla starts gathering people to start the meeting.");
		input.nextLine();
		System.out.print("You and the woman join the group in a seperate room.");
		input.nextLine();

	}

	public void chapterTwoChildrenOfTheHollowMeeting() {
		System.out.println("\n-----------------Chapter 2.5: The Meeting-------------");
		System.out.print("\nOnce you are in the meeting room " + playerCompanion + " closes the door behind you.");
		input.nextLine();
		System.out.print("Everyone stares at you for a brief moment before forming a sitting circle around Camilla.");
		input.nextLine();
		System.out.print("\nCamilla: " + playerName + " please come and sit.");
		input.nextLine();
		System.out.print("\nYou sit where she motioned.");
		input.nextLine();
		System.out.print("\nCamilla: Children of The Hollow, we gather here today for many reasons.");
		input.nextLine();
		System.out.print("Camilla: The prophecy, the war, and the plan are all at stake.");
		input.nextLine();
		System.out.print("Camilla: The descions we make today affect us all tommorrow.");
		input.nextLine();
		System.out.print("Camilla: So we must be wise.");
		input.nextLine();
		System.out.print("Camilla: What should we discuss first?");
		input.nextLine();
		// run method that explains everything
		chapterTwoMeetingQuestion();
		input.nextLine();
		System.out.print("");
		chapterThreeHeadingForBattle();
	}

	public void chapterTwoMeetingQuestion() {
		// local variable
		int choice;
		// while statement that runs code until all options are true
		while (optionOne == false || optionTwo == false || optionThree == false) {
			// prompt user
			System.out.print("\nWhat do you want to discuss?");
			input.nextLine();
			System.out.println("1: The phrophecy");
			System.out.println("2: The war");
			System.out.println("3: The plan");

			choice = input.nextInt();

			// if else statements
			if (choice == 1 && optionOne == false) {
				chapterTwoProphecy();
				optionOne = true;
			} else if (choice == 1 && optionOne == true) {
				int prophecy;
				// dialog if user has already used this option
				System.out.print("\nCamilla: We already have discussed the prophecy.");
				input.nextLine();
				System.out.print("\nCamilla: Do you want to hear it again?");
				input.nextLine();

				// prompt user
				System.out.print("\nWhat do you want to do?");
				input.nextLine();
				System.out.println("\n1: Hear the prophecy again");
				System.out.println("2: Hear something else");

				prophecy = input.nextInt();
				// if else statement
				if (prophecy == 1) {
					chapterTwoProphecy();
				} else if (prophecy == 2) {
					// restart method
					chapterTwoMeetingQuestion();
				} else {
					// mock user and restart method
					System.out.print("\nThat's not even an option!!\nTry Again!");
					input.nextLine();
				}

			}

			else if (choice == 2 && optionTwo == false) {
				chapterTwoWar();
				optionTwo = true;
			} else if (choice == 2 && optionTwo == true) {
				int war;
				// dialog if user has already used this option
				System.out.print("\nCamilla: We already have discussed the war.");
				input.nextLine();
				System.out.print("\nCamilla: Do you want to hear it again?");
				input.nextLine();

				// prompt user
				System.out.print("\nWhat do you want to do?");
				input.nextLine();
				System.out.println("\n1: Hear about the war again");
				System.out.println("2: Hear something else");

				war = input.nextInt();
				// if else statement
				if (war == 1) {
					chapterTwoWar();
				} else if (war == 2) {
					// restart method
					chapterTwoMeetingQuestion();
				} else {
					// mock user and restart method
					System.out.print("\nThat's not even an option!!\nTry Again!");
					input.nextLine();
				}
			}

			else if (choice == 3 && optionOne == false || optionTwo == false) {
				System.out.print("\nCamilla: I don't think that would make sense yet.\n");
				input.nextLine();
				System.out.print("Camilla: Wait to hear about everything else first!");
				input.nextLine();
				chapterTwoMeetingQuestion();
			} else if (choice == 3 && optionOne == true && optionTwo == true) {
				chapterTwoPlan();
				optionThree = true;
			} else {
				// mock user and restart method
				System.out.print("\nThat's not even an option!!\nTry Again!");
				input.nextLine();
				chapterTwoMeetingQuestion();
			}

		}
	}

	public void chapterTwoProphecy() {
		System.out.print("\nCamilla: The prophecy, good choice.\n");
		input.nextLine();
		System.out.print("Camilla: I know you don't remember much, but this world is very old.");
		input.nextLine();
		System.out.print("Camilla: Many things have happened, from sky explosions to reanimating the dead.");
		input.nextLine();
		System.out.print("Camilla: Throughout the chaos, a story emerged regarding Kikioro Village.");
		input.nextLine();
		System.out.println("Camilla: You may have seen it in the town square..");
		input.nextLine();
		System.out.print(playerCompanion + ": Although someone scribbled the last line out..");
		input.nextLine();
		System.out.print("\nCamilla: Well, yes that is true.");
		input.nextLine();
		input.nextLine();
		System.out.print(
				"\nCamilla: However, The Prophecy of The Kikioro Warrior is more relevant than it ever has been.");
		input.nextLine();
		System.out.print("Camilla: " + playerName + " this is a story that could be your future.");
		input.nextLine();
		System.out.print("\nThe Children of The Hollow members start humming together in a low key.");
		input.nextLine();
		System.out.print("\nCamilla: It is said that there will be a warrior with no past or ties.");
		input.nextLine();
		System.out.print("Camilla: They will stumble outside our village on an important date");
		input.nextLine();
		System.out.print("Camilla: Three Gouger's will emerge to the town to let everyone know.");
		input.nextLine();
		System.out.print("Camilla: And with that alert, there is one cycle to prep");
		input.nextLine();
		System.out.print("Camilla: And one more to attack.");
		input.nextLine();
		System.out.print("\nCamilla: After that the God's may listen, and give mercy to us all.");
		input.nextLine();
		System.out.print("Camilla: We have nothing else, we need to finish the first cycle.");
		input.nextLine();
		System.out.print("Camilla: It is our story, and our only chance.");
		input.nextLine();
		System.out.print("\nGroup members: It is our story and our only hope.\n");

	}

	public void chapterTwoWar() {
		System.out.print("\nCamilla: Yes, the war....\n");
		input.nextLine();
		System.out.print("Camilla: You probably do not remeber, but there is an undead army in this world.");
		input.nextLine();
		System.out.print("Camilla: They seek fresh bodies, and have declared war on the living.");
		input.nextLine();
		System.out.print("Camilla: For the past 75 years...it has been us vs them.");
		input.nextLine();
		System.out.print("Camilla: They have taken many of our own.");
		input.nextLine();
		if (playerCompanion == "Ana") {
			System.out.print("\nAna: Even my parents..");
			input.nextLine();
		}
		System.out.print("\nCamilla: So we are fighting back.");
		input.nextLine();
		System.out.print("\nGroup members: So we are fighting back!\n");

	}

	public void chapterTwoPlan() {
		System.out.print("\nCamilla: Now that you know what is going on, it is time for the plan.\n");
		input.nextLine();
		System.out.println("Camilla: Our current plan doesn't reach far.");
		input.nextLine();
		System.out.print(playerCompanion + ": We have to take this one step at a time.");
		input.nextLine();
		System.out.print("\nCamilla: Exactly. So we are planning on a suprise attack at a nearby base.");
		input.nextLine();
		System.out.print("Camilla: According to the prophecy, if we finish prepping tonight and battle tommorrow..");
		input.nextLine();
		System.out.print("Camilla: We have a chance of ending this. ");
		input.nextLine();
		System.out.print("\nCamilla: So, lay down, and get comfortable.");
		input.nextLine();
		System.out.print("She points towards a small cot in the corner of the room.");
		input.nextLine();
		System.out.print("\nYou make your way over to the cot and lie down.");
		input.nextLine();
		System.out.print("\nCamilla: Let us give the warrior strength and finish the ritual.");
		input.nextLine();
		System.out.print("\nGroup members surround you, and start tossing powders at you while humming. ");
		input.nextLine();
		System.out.print("Your eyes start to feel heavy as they get closer.");
		input.nextLine();
		System.out.print("Suddnely, you are asleep.");
		input.nextLine();
		playerHP += 20;
		deadOrAlive();

	}

	public void chapterThreeHeadingForBattle() {
		System.out.print("Fixed loop!");
	}
}
