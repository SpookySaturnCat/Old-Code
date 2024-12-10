//1. The following program reads an integer number using a Scanner object and
//then displays that number using a println statement. Please enter and run the
//program.
//package homework;
//import java.util.Scanner;
//public class Lab2 {
//public static void main(String[] args) {
//Scanner myInput = new Scanner(System.in);

//System.out.print("Enter the value of num1: ");
//int num = myInput.nextInt();

//2. Modify the program to use a simple if-statement so that it only prints out the
//number if it is bigger than 3.

//3. Run your program twice—once with 17 as the input number and once with 3
//as the input number (you don’t need to hand anything in for this part of the
//lab).

//import java.util.Scanner;

//public class HW2P1 {
	//public static void main(String[] args) {
		//Scanner myInput = new Scanner(System.in);

		//System.out.print("Enter the value of num1: ");
		//int num = myInput.nextInt();
		
		//if (num > 3){
			//System.out.println(num);
			
			
		//}
		
	//}
//}
import java.util.Scanner;

public class HW2P1 {
	public static void main(String[] args) {
		Scanner myInput1 = new Scanner(System.in);
		Scanner myInput2 = new Scanner(System.in);

		System.out.println("Enter the value of num1: ");
		int num1= myInput1.nextInt();

		System.out.println("Enter the value of num2: ");
		int num2= myInput2.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1 + " " + num2 + " " + temp);
	}
}