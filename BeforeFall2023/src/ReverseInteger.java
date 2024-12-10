import java.util.Scanner;
public class ReverseInteger {
	
	public static void main(String[] args) {
		
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		reverse(number);
		
	}

	public static void reverse(int number) {
		while (number != 0) {
			int remainder = number % 10;
			System.out.print(remainder);
			number = number / 10;
		}

	}

}
