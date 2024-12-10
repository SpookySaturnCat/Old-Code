import java.util.Scanner;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class IngredientsTest {
	public static void main(String[] args) {
		
		
		CreateRecipe fries = new CreateRecipe("Fries", 10);
		CreateRecipe milkShake = new CreateRecipe("Milk Shake",10 );
		CreateRecipe curry = new CreateRecipe("Tofu Curry", 10);
		CreateRecipe bwdb = new CreateRecipe("Big Walk Dog Burger", 10);
		
		bwdb.cook();
		
		
		/*
		//Input file
		File inputFile = new File("C:\\Users\\justi\\Desktop\\Fries.txt");
		
		//Null scanner init.
		Scanner input = null;
		
		
		// Try catch for using reading from input file.
		try {
			input = new Scanner(inputFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Var to hold the amount of lines within the file.
		int fileLengthLine = 0;
		
		// Calc the number of lines within the file.
		while (input.hasNext()) {
			input.nextLine();
			fileLengthLine++;
		}
		
		// Close the file so you can reopen it for reprocessing.
		input.close();
		
		// Reopen file to put text into an array that has the size of the amount of lines.
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Create array with the size of the number of lines in the file.
		String[] recipe = new String[fileLengthLine];
		
		// Put each line into the array.
		for (int i = 0; i < fileLengthLine; i++) {
			recipe[i] = input.nextLine();
			System.out.printf("%s%n", recipe[i]);
		}
	
	*/
	
	}
}
