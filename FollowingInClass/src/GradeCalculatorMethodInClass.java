import java.util.Scanner;

public class GradeCalculatorMethodInClass {

	public static char findLetterGrade(double numericGrade) {

		// Initilize letter grade
		char letterGrade = 'z';

		if (numericGrade >= 90.0) {
			letterGrade = 'A';

		} else if (numericGrade >= 80.0) {
			letterGrade = 'B';

		} else if (numericGrade >= 70.0) {
			letterGrade = 'C';

		} else if (numericGrade >= 60.0) {
			letterGrade = 'D';

		} else {
			letterGrade = 'F';
		}

		return letterGrade;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Prompt user and store value
		System.out.print("Please eneter the numeric grade: ");
		double userGrade = input.nextDouble();
		char lGrade = findLetterGrade(userGrade);
		
		System.out.println(lGrade);

	}

}
