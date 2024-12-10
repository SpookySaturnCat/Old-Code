
public class TestMax {
	
	public static int max (int number1, int number2) {
		int result;
		
		if (number1 > number2)
			result = number1;
		else
			result = number2;
		return result;
	}

	public static void main(String[] args) {
		
		int i = 5;
		int j = 2;
		
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and " + j 
				+ " is " + k);

	}

}
