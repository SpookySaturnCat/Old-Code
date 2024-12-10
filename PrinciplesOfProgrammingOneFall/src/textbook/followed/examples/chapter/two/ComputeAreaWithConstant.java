/**
 * File: ComputeAreaWithConstant.java
 * Author: Seraphina Morrison
 * Created: 08/20/23
 * Description: Computes the area of a circle with a user
 * inputed number and uses a constant PI variable
 */
package textbook.followed.examples.chapter.two;
import java.util.Scanner;

public class ComputeAreaWithConstant {
	public static void main(String[] args) {
	//create scanner object
	Scanner input = new Scanner(System.in);
	//declare and initilize PI
	final double PI = 3.14159;
	//prompt user
	System.out.println("Please enter the radius: ");
	//declare and initilize radius
	double radius = input.nextDouble();
	//compute area
	double area = radius * radius * PI;
	//display results
	System.out.println("The area is: " + area);
	}
}
