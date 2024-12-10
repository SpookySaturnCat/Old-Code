/**
 * File: ShowLogicErrors.java
 * @author Christopher Williams
 * Created on: Jun 6, 2016
 * Modified on: Jun 6, 2017
 * Description:  Show logic errors, conversion should be 95.0, 
 * 				 double division vs. integer  
 */

public class ShowLogicErrors {
	public static void main(String[] args) {
		System.out.print("Celsius 35 is Fahrenheit ");
		System.out.println((9 / 5) * 35 + 32);
	}
}