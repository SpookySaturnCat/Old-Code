public class KilometersAndMiles {

	public static void main(String[] args) {
		double mileToKilo = mileToKilometer(10.0);
		System.out.println("10 miles is " + mileToKilo + " kilometers");
		double kiloToMile = kilometerToMile(20.0);
		System.out.println("20 kilometers is " + kiloToMile + " miles");

	}
	public static double mileToKilometer(double mile) {
		double kilometer = 1.6 * mile;
		return kilometer;
	}
	public static double kilometerToMile(double kilometer) {
		double mile = kilometer / 1.6;
		return mile;
	}

}
