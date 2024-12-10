
public class Utilities {
	
	// Ask William's about private/public
	public int d20() {
		
		return (int)(Math.random() * 21);
	}
	
	public static int d10() {
		return (int) (Math.random() * 10);
	}
	
	public static int d9() {
		return (int) (Math.random() * 9);
	}
	
	public static int d2() {
		return (int) (Math.random() * 3);
	}
	
	public static int randomIndex(int[] arr) {
		int index = 0;
		
		index = (int) (Math.random() * arr.length);
	
		return index;
	}
	
	public static int randomIndex(String[] arr) {
	int index = 0;
	
	index = (int) (Math.random() * arr.length);

	return index;
	}
	
	public void errorMessage() {
		System.out.println("Error: Invalid input\nTry again!");
	}
	public void println() {
		System.out.println();
	}

}
