/**
 * File: ChapterTwoExerciseFive.java
 * Author: Seraphina Morrison
 * Created: 08/24/23
 * Description: This program calculates gratuity and total
 * based on their inputed subtotal and and desired tip rate
 */
package ungraded.exercises.chapter2;
import java.util.Scanner;

public class ChapterTwoExerciseFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please eneter the subtotal for the service: ");
		double subtotal = input.nextDouble();
		System.out.print("Please eneter the rate you want to tip (integers only): ");
		double tipRate = input.nextInt();
		double gratuity = subtotal * tipRate / 100;
		double total = gratuity + subtotal;
		System.out.print("The gratuity is $" + gratuity +  " with " + total + " as your total.");
	}
}
