import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Utilities {

	// Save file method
	public static void save(User user) {
		
		//  Create file object with relative path
		File saveFile = new File("src/saveFile.txt");

		// Check if the file exists then deletes
		if (saveFile.exists()) {
			saveFile.delete();
		}

		// Writes information to the file
		try {
			PrintWriter output = new PrintWriter(saveFile);

			output.printf("Name: %s%nPronouns: %s%nLevel: %d%nStage: %s%nRecipes cooked: %d", user.getName(), Arrays.toString(user.getPronouns()), user.getLevel(), user.getStage(), user.getRecipes());
			output.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String[] fileToStringArray(File file, String name) {
		
		// Initialize variables
		Scanner input = null;
		String currentLine;
		int length = getLineCountForArrayFromFile(file, name), sentinal = 0, lineCount = 0;
		String[] arr = new String[length];
		
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (input.hasNext()) {

			currentLine = input.nextLine();

			if (currentLine.equals(name)) {

				while (!currentLine.equals("--")) {

					currentLine = input.nextLine();

					if (!currentLine.equals("-") && !currentLine.equals("--")) {
						arr[lineCount] = currentLine;
						
						lineCount++;
					}
				}
			}
		}
				input.close();
				return arr;
	}
	
	public static int getLineCountForArrayFromFile(File file, String name) {
		
		Scanner input = null;
		String currentLine;
		int lineCount = 0;

		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (input.hasNext()) {

			currentLine = input.nextLine();

			if (currentLine.equals(name)) {

				while (!currentLine.equals("--")) {

					currentLine = input.nextLine();

					if (!currentLine.equals("-") && !currentLine.equals("--")) {
						lineCount++;
					}
				}
			}
		}
		input.close();
		return lineCount;
	}
}
