
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		
		//generates random numbers
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis()*7 %10);
   
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompts user to input answer
		System.out.print("What is " + number1 + " + " + number2 + " ? ");
		
		//sets answer as input
		int answer = input.nextInt();
		
		//prints out results while calculating if it is
		//true or false based on the equals operator 
		System.out.println(
				number1 + " + " + number2 + " = " + answer + " is " +
				(number1 + number2 == answer));
	}

}
