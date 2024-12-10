
import java.util.*;

public class CalculatorSwitch {
	public static void main(String[] args) {
		// get operands and operator from user
		Scanner input = new Scanner(System.in);
		int op1 = 0, op2 = 0, result = 0;
		char operation; 
		char operationOutput = 'X';
		
		// prompt user for values
		System.out.print("Enter first value: ");
		op1 = input.nextInt();
		
		System.out.print("Enter operation (+, -, *, /): ");
		String tmp = input.next();
		operation = tmp.charAt(0);
				
		System.out.print("Enter second value: ");
		op2 = input.nextInt();
		
		// perform operation
		switch (operation) {
			case '+':
			case 'A':
			case 'a':
				result = op1 + op2;
				operationOutput = '+';
				break;
			case '-':
			case 'S':
			case 's':
				result = op1 - op2;
				operationOutput = '-';
				break;
			case '*':
			case 'M':
			case 'm':
				result = op1 * op2;
				operationOutput = '*';
				break;
			case '/':
			case 'D':
			case 'd':
				result = op1 / op2;
				operationOutput = '/';
				break;
			default:
				operation = 'X';
		}
		
		// output results of operation
		if (operation != 'X') {
			System.out.println("\n" + op1 + " " + operationOutput + " " + op2 + " = " + result);
		} else {
			System.out.println("You chose an invalid choice");
		}
		
	}

}
