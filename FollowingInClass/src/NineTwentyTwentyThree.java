
public class NineTwentyTwentyThree {
	public static void main(String[] args) {
		
		String peaches = "Peaches";
		String loki = "Loki";
		String temp = peaches;
		peaches = loki;
		loki = temp;
		System.out.println(peaches + "" + loki);
	}
}
