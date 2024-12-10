package ungraded.exercises.chapter4;

import java.util.Scanner;

public class Exercise04_22 {
  public static void main(String[] args) {
	 
	// Create scanner object
    Scanner input = new Scanner(System.in);
    
    // Prompt user and store value
    System.out.print("Enter string s1: ");
    String s1 = input.nextLine();
    
    System.out.print("Enter string s2: ");
    String s2 = input.nextLine();
    
    // If else to check if it is a substring or not
    if (s1.indexOf(s2) != -1) {
      System.out.println(s2 + " is a substring of " + s1);
    }
    else {
      System.out.println(s2 + " is not a substring of " + s1);
    }
  }
}
