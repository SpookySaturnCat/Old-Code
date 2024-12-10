package ungraded.exercises.chapter6;

public class Proect06_01 {
	
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {

		if (i % 10 == 0) {
		System.out.println(getPentagonalNumber(i));
		} else {
		System.out.print(getPentagonalNumber(i) + " ");
		}
	}
	}
	public static int getPentagonalNumber(int n) {
		
		return n * ((3 * n) - 1) / 2;
	}
}
