import java.util.Scanner;

public class Hex2Dec {
	//main method
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter string
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine(); //reads string on this line 
		
		System.out.println("The decimal value for hex number "
				+ hex + " is " + hexToDecimal(hex.toUpperCase())); //invokes hexToDecimal to convert hex string
	}                                                              //to decimal number
	public static int hexToDecimal(String hex) { //returns integer
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) { //length of string determined here
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal (hexChar);
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) { //return decimal value for hex charecter
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}