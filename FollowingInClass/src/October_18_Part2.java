
public class October_18_Part2 {
	public static void main(String[] args) {
		
		// (char) (ch1 + Math.raondom() * (ch2 - ch1 + 1));
		char randomChar = (char) ('a' + Math.random() * ('z' - 'a' + 1));
		
		System.out.printf("%c", randomChar);
	}
}
