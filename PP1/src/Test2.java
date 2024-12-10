/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 28, 2023
 *Test2
 */

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		 // Create a Scanner
		 Scanner input = new Scanner(System.in);
		 
		 // Prompt the user to enter the number of lines
		 System.out.print("Enter an even number between 2 to 20: ");
		 int patternTarget = input.nextInt();
		 printPattern(patternTarget);
		 }
	
	public static void printPattern(int patternTarget) {
		
		
				int count = 0;
				int number = 2;
				
				
				do  { 
					
					if (patternTarget % 2 == 0 && patternTarget < 21) {
			
						System.out.printf("%-5d\n" +number);
							number+=2;
							count+=2;
						}
					
						else
							System.out.println("Invalid input");
					return;
					
				
						
				}
					while (count < patternTarget);	
	}
}
				
		
			
	


