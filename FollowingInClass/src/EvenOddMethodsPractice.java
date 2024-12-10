
public class EvenOddMethodsPractice {
	public static void main(String[] args ) {
		 
		for (int i = 1; i <= 10; i++) {
		System.out.print(i + " ");
		printIsEven(i);
		}
	}
	public static void printIsEven(int number) {
		
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	
}
