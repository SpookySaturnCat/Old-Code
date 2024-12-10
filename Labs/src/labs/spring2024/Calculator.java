/**
 * File: ch12/Calculator.java
 * @author Christopher Williams, Seraphina Morrison, Taylor O'Neal
 * Created on: Apr 18, 2016
 * Modified: 02/23/24
 * Description:  Create a simple text-based calculator to add exception handling to  
 */

package labs.spring2024;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// declare and initialize variables
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		char operation = 0;
		String message = "The program is terminating";

		// read in operands and operation from user
		System.out.print("Enter an integer (operand 1) and press Enter: ");
		num1 = scanner.nextInt();

		System.out.print("Enter an operation (+, -, /, *) and press Enter: ");
		operation = scanner.next().charAt(0);

		System.out.print("Enter an integer (operand 2) and press Enter: ");
		num2 = scanner.nextInt();

		// The result of the operation
		int result = 0;

		try {
			// Determine the operator
			switch (operation) { 
			case '+': 
				result = num1 + num2;
				break;
			case '-': 
				result = num1 - num2;
				break;
			case '*': 
				result = num1 * num2;
				break;
			case '/': 
				result = num1 / num2;
				break;
			default: 
				throw new InvalidCalcOperationException (operation);
				
			} 
			// Display result
			System.out.printf("%d %c %d = %d\n", num1, operation, num2, result);
		}
		catch (InvalidCalcOperationException ex){
			System.out.println(ex.getMessage());
			message = message + " because of an error\n";
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.print(message);
			// Do booleans instead concatenated string

		}
	}		
}
