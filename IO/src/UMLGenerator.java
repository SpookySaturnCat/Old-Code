import java.util.Scanner;
import java.io.*;

// Have to work on the formating.. different places online have different formats.. 

/* Use Example: 
Circle
Private
Radius : Double
Methods
Public
Void setRadius
Double getRadius
Double calcDiameter
Double calcCircum
Double calcArea
*/
public class UMLGenerator {
	public static void main(String[] args) {
		
		// Change files to your input and output files.
		File inputFile = new File("src/UMLInput.txt");
		File outputFile = new File("src/UMLOutput.txt");
		
		inputFile.mkdir();
		
		// Set as null so it can be init.
		PrintWriter output = null;
		Scanner input = null;

		// Create PrintWriter.
		try {
			output = new PrintWriter(outputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Create Scanner.
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Formatting.
		output.printf("-------------------------%n");
		// First line is Class name.
		output.printf("%s%n-------------------------", input.next());

		// Init vars.
		String symbol = "";
		String nextLine = "";
		Boolean isMethod = false;

		// Loop to iterate through file.
		while (input.hasNext()) {

			// Save the next line to a var.
			nextLine = input.nextLine();
			
			// Removes ending whitespace if there are any.
			nextLine = nextLine.stripTrailing();

			// Sets the symbol based on whether its private or public.
			if (nextLine.equals("Private")) {
				symbol = "-";
			}
			if (nextLine.equals("Public")) {
				symbol = "+";
			}

			// Partition between methods and vars.
			if (nextLine.equals("Methods")) {
				output.printf("-------------------------%n");
				isMethod = true;

			}

			// Don't print the lines that contain Private, Public, Or Methods.
			if (!nextLine.equals("Private") && !nextLine.equals("Public") && !nextLine.equals("Methods")) {

				// If it is a method you add parentheses to the end, else don't add parentheses.
				// Add symbol in front of line.
				if (isMethod) {
					output.printf("%s %s()%n", symbol, nextLine);
				} else {
					output.printf("%s %s%n", symbol, nextLine);
				}
			}

		}

		// Finished output.
		System.out.print("Finished Processing UML.");
		output.printf("-------------------------");
		output.close();
		input.close();

	}
}
