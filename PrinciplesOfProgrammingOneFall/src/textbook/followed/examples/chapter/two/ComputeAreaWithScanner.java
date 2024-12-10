/**
 * File: ComputeAreaWithScanner.java
 * Author: Seraphina Morrison
 * Created: 08/19/23
 * Description: Compute area of a circle with the users inputed radius
 */
package textbook.followed.examples.chapter.two;
import java.util.Scanner;

public class ComputeAreaWithScanner {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		//prompt user
		System.out.println("Please eneter the radius: ");
		//declare and assign radius
		double radius = input.nextDouble();
		//compute area
		double area = radius * radius * 3.14159;
		//print results
		System.out.println("The area is: " + area);	
		}
	}
