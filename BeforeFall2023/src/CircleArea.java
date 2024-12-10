import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creates a scanner object
        
        //prompt user to enter radius
        System.out.print("Enter a number for radius ");
        double radius = input.nextDouble();
        
        //compute area of circle
        double area = radius * radius * radius * 3.14159;
        
        //display results
        System.out.println("The area for the circle of a radius " +
                radius + " is " + area);
	}

}
