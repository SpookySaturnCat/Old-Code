
public class TwoDArrayExamPractice {
	
	public static char randomAnswer() {
		
		int randomNumber = (int) ((Math.random() * 4));
		char answer = 'X';
		
		switch (randomNumber) {
		case 0: answer = 'A';
		break;
		case 1: answer = 'B';
		break;
		case 2: answer = 'C';
		break;
		case 3: answer = 'D';
		break;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int lengthOfExam = (int) ((Math.random() * 40) + 1);
		int numberOfStudents = (int) ((Math.random() * 50) + 1);
		int correctAnswers;
		
		char[][] exam = new char[numberOfStudents][lengthOfExam];
		
		char[] examKey = new char[lengthOfExam];
		
		double[][] studentScores = new double[2][numberOfStudents];
		
		for (int i = 0; i < examKey.length; i++) {
			examKey[i] = randomAnswer();
		}
		
		for (int row = 0; row < exam.length; row++) {
			for (int column = 0; column < exam[row].length; column++) {
				exam[row][column] = randomAnswer();
			}
		}
		
		System.out.print("Questions:   |");
		
		for (int i = 0; i < examKey.length; i++) {
			System.out.printf(" %d |", i + 1);
		}
		
		for (int row = 0; row < exam.length; row++) {
			if (row < 9) {
				System.out.printf("\nStudent #%d:  | ", row + 1);
			} else {
				System.out.printf("\nStudent #%d: | ", row + 1);
			}
			for (int column = 0; column < exam[row].length; column++) {
				if (column < 9) {
					System.out.printf("%c | ", exam[row][column]);
				} else {
					System.out.printf(" %c | ", exam[row][column]);
				}
			}
		}
		
		System.out.print("\n\nQuestions:   |");
		
		for (int i = 0; i < examKey.length; i++) {
			System.out.printf(" %d |", i + 1);
		}
		
		System.out.print("\nAnswer Key:  | ");
		
		for (int i = 0; i < examKey.length; i++) {
			if (i < 9) {
				System.out.printf("%c | ", examKey[i]);
			} else {
				System.out.printf(" %c | ", examKey[i]);
			}
		}
		
		for (int student = 0; student < exam.length; student++) {
			correctAnswers = 0;
			for (int question = 0; question < exam[student].length; question++) {
				if (exam[student][question] == examKey[question]) {
					correctAnswers++;
				}
			}
			studentScores[0][student] = correctAnswers;
			studentScores[1][student] = (100 / (double) lengthOfExam) * correctAnswers;
		}
		
		System.out.printf("\n\nStudent #: Correct Answers: Grade: \n", lengthOfExam);
		
		for (int i = 0; i < exam.length; i++) {
			if (i < 9) {
				if (studentScores[0][i] < 10.0) {
					System.out.printf("Student #%d:       %d         %.2f\n", i + 1, (int) studentScores[0][i], studentScores[1][i]);
				} else {
					System.out.printf("Student #%d:       %d        %.2f\n", i + 1, (int) studentScores[0][i], studentScores[1][i]);
				}
			} else {
				if (studentScores[0][i] < 10.0) {
					System.out.printf("Student #%d:      %d         %.2f\n", i + 1, (int) studentScores[0][i], studentScores[1][i]);
				} else {
					System.out.printf("Student #%d:      %d        %.2f\n", i + 1, (int) studentScores[0][i], studentScores[1][i]);
				}
			}
		}
		
		System.out.printf("\nThe total amount of questions was %d, and %d students took the test. ", lengthOfExam, numberOfStudents);
		
	}

}
