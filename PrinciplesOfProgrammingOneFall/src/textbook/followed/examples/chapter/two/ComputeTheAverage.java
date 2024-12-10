package textbook.followed.examples.chapter.two;
import java.util.Scanner;
/**
 * File: ComputeTheAvaerage.java
 * Author: Seraphina Morrison
 * Created: August 19, 2023
 * Description: Computes the average of three user inputed numbers
 */
public class ComputeTheAverage {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		//prompt user
		System.out.println("Please enter three numbers: ");
		//declares and assigns user input to variables
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		//computes average
		double average = (number1 + number2 + number3) / 3.0;
		//prints results
		System.out.print("The average is:" + average);
		}
	}
