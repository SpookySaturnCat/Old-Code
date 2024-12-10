import java.util.Scanner;

public class Chapter05_08 {
	public static void main(String[] args) {
	
		// Initilzie variables
		String studentName = "";
		String finalStudentName = "";
		double studentGrade = 0;
		double maxGrade = 0;
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for iterations
		System.out.print("Please enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		// For loop
		for (int i = 1; numberOfStudents >= i; i++) {
			
			// Prompt user and store the values
			System.out.print("Please enter the name of the student: ");
			studentName = input.next();
			
			System.out.print("Please enter the score of the student: ");
			studentGrade = input.nextDouble();
			
			// Swap selection
			if (studentGrade > maxGrade) {
				maxGrade = studentGrade;
				finalStudentName = studentName;
			}
		}
		// Print results
		System.out.printf("\nThe name of the student with the highest score is %s\nTheir grade is %.2f", finalStudentName, maxGrade);
	}
}
