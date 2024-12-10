
/**
 * File: PAssign02.java
 * Author: Seraphina Morrison
 * Class: CSCI1301
 * Created: 09/06/23
 * Last Modified: 09/07/23
 * Description: This program allows the user to enter their grades 
 * for PP1 and calculates their final grade by weights provided in
 * the syllabus
 */
import java.util.Scanner;

public class PAssign02 {
	public static void main(String[] args) {

		// Create scanner object and counter variable
		Scanner input = new Scanner(System.in);
		int countGrades = 0;
		
		// Create grade weight variables
		double revelWeight = 0.10;
		double pAssignWeight = 0.10;
		double labGradeWeight = 0.10;
		double examOneWeight = 0.15;
		double examTwoWeight = 0.15;
		double examThreeWeight = 0.15;
		double finalExamWeight = 0.25;

		/*
		 * Print prompts for user and store values in double variables multiplied by weight
		 * Counts how many grades the user enters after each input
		 */
		System.out.println("Welcome to the Fall 2023 CSCI1301 grade calculator.");

		System.out.print("Please enter your Revel grade: ");
		double revelGrade = input.nextDouble() * revelWeight;
		countGrades++;

		System.out.print("Please enter your Programming Assignment grade: ");
		double programmingAssignmentGrade = input.nextDouble() * pAssignWeight;
		countGrades++;

		System.out.print("Please enter your lab grade: ");
		double labGrade = input.nextDouble() * labGradeWeight;
		countGrades++;

		System.out.print("Please enter your Exam 1 grade: ");
		double examOneGrade = input.nextDouble() * examOneWeight;
		countGrades++;

		System.out.print("Please enter your Exam 2 grade: ");
		double examTwoGrade = input.nextDouble() * examTwoWeight;
		countGrades++;

		System.out.print("Please enter your Exam 3 grade: ");
		double examThreeGrade = input.nextDouble() * examThreeWeight;
		countGrades++;

		System.out.print("Please enter your Final Exam grade: ");
		double finalExamGrade = input.nextDouble() * finalExamWeight;
		countGrades++;

		// Compute final grade
		double finalGrade = revelGrade + programmingAssignmentGrade + labGrade 
				+ examOneGrade + examTwoGrade + examThreeGrade + finalExamGrade;

		// Print results
		System.out.println("There were " + countGrades + " grades entered.");
		System.out.println("The final grade for this course is " + finalGrade + ".");
	}
}
