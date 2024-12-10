
public class October_09 {
	public static void main(String[] args) {

		System.out.println("Sum is from 1 to 10 is " + sumOf(1, 10));
		System.out.println("Sum is from 20 to 30 is " + sumOf(20, 30));
		System.out.println("Sum is from 25 to 40 is " + sumOf(25, 30));
	}

	public static int sumOf(int ia, int ib) {
		int sum = 0;

		for (int i = ia; i <= ib; i++) {
			sum += i;
		}
		return sum;

	}
}
