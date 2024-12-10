import java.util.Scanner;

public class InsideCircle {

	public static void main(String[] args) {
		//creates scanner object
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//raises to the power of 0.5
		//the same as square rooting
		double distance = Math.pow(x*x + y*y, 0.5);
		
		if (distance <= 10)
			System.out.println("Point is inside the circle");
			
		else
			System.out.println ("Point is outside the circle");

	}

}
