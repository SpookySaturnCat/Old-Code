import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int data;
		int sum = 0;

		do {
			System.out.print("Enter an integer (the input ends if it is 0)");
			data = input.nextInt();
			sum += data;
		} while (data != 0);
		System.out.print("The sum is " + sum);
	}
}
