/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 17, 2023
 *Lab1
 *This code will convert meters to feet and display results on the console*/


import java.util.Scanner;//import Scanner class

public class Lab1 { //main method
   public static void main(String[] args) { 
   /*This will create a scanner object, assigning it to the
   input variable, while using system.in as the data stream*/ 
   Scanner input = new Scanner(System.in); 
	  	
	 //This will prompt users to enter information
	 System.out.print("Please enter the value of feet: ");
	 //Assigns the user input to foot variable
	 double foot = input.nextDouble(); 
	
	 //calculates feet to meters
	 double meter = 0.305*foot; 
	//prints results
	 System.out.println(+ foot + " ft converted to meters is " + meter + " m");
   }
}