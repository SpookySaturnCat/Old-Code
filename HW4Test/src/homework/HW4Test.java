package homework;
import brandon.math.Random;
import brandon.math.Math;

public class HW4Test {
	/** Main method */
	public static void main(String[] args) {
		// find mean
		double meanValue = mean(99, 1000);

		// find standard deviation
		double deviationValue = deviation(99, 1000);

		// display result
		System.out.println("The mean is " + meanValue);
		System.out.println("The standard deviation is " + deviationValue);
	}

	
	public static double mean (int boundary, int n) {
	  /*sum is set to zero so we can add all values 
	  together; this just initializes the variable.*/
	  double sum = 0.0;
	  
	  //for loop that executes until amount n is achieved
	  for (int findSum = 0; findSum < n; findSum++) {
		
		  //generate random number within the boundary
		 int randomNumber = (int) (Math.random()* (boundary +1));
		 //adds the above value to sum
		  sum += randomNumber;
	  }
	  //returns sum divided by n (amount of integers)
	  return sum /n;
  }

	public static double deviation(int boundary, int n) {
	
		/*sum and squareSum are set to zero so we can add all 
		values together; this just initializes the variable.*/
		double sum = 0.0;
		double squareSum = 0.0;
		  
		  //for loop that executes until amount n is achieved
		  for (int findSum = 0; findSum < n; findSum++) {
			  
			  //generate random number within the boundary
			 int randomNumber = (int) (Math.random()* (boundary +1));
			 //adds the above value to sum
			  sum += randomNumber;
			  //squares random numbers
			  squareSum += Math.pow(randomNumber, 2);
		  }
		  //returns with values converted to standard deviation
		  return Math.sqrt((squareSum - sum * sum / n)/(n - 1));
	}	
}
