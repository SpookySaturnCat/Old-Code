
public class WaterBottle {

	// Data members for class
	private double height;
	private double radius;
	private String color = "";
	private static double largestInitialVolume;

	// Default no-args constructor
	public WaterBottle() {
		this(12, 2);
	}

	// Required convince constructor
	public WaterBottle(double height, double radius) {

		// Mutate with default values and passed parameters
		setHeight(height); // Mutate height
		setRadius(radius); // Mutate radius
		setColor("green");
		checkInitialVolume(); // Checks for largest volume
	}

	// Prints info
	public String getInfo() {

		String formattedS = String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f",
				getColor(), getHeight(), getRadius(), getVolume());

		return formattedS;
	}

	// Returns computed volume
	public double getVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	// Finds the largest volume out of all instances created
	public void checkInitialVolume() {

		if (getVolume() > largestInitialVolume) {
			largestInitialVolume = getVolume();
		}
	}

	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		
		// Checks if height is above 0, if not sets to default value
		if (height > 0.0) {
			this.height = height;
		} else {
			setHeight(12);
		}
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {

		// Checks if radius is above 0, if not sets to default value
		if (radius > 0.0) {
			this.radius = radius;
		} else {
			setRadius(2);
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
