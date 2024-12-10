
public class MaxModularized {
	public static void main(String[] args) {

		int num1 = 3, num2 = 4, num3 = 5, num4 = 6, largest;

		largest = maximum(num1, num2, num3, num4);
		System.out.println(largest);
		}

	public static int maximum(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int maximum(int a, int b, int c) {
		return maximum(maximum(a, b), c);
	}
	public static int maximum(int a, int b, int c, int d) {
		return maximum(maximum(a, b, c), d);
	}
}
