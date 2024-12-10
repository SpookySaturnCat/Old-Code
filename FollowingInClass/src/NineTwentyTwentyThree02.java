
public class NineTwentyTwentyThree02 {
	public static void main(String[] args) {
		
		int num = 272;
		int firstDigit = 272 / 100;
		int lastDigit = num % 10;
		System.out.println(firstDigit == lastDigit);
		
		String number = "" + num;
		System.out.println(number.charAt(0) == number.charAt(2));		
		
	}
}
