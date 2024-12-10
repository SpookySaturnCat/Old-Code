
public class LunchBag {

	// Data members
	private double length;
	private double width;
	private double height;
	private WaterBottle waterBottle;

	// Default no-args constructor
	public LunchBag() {

		// Given values for default
		setLength(11.2);
		setWidth(6.1);
		setHeight(7.9);
	}

	// Convenience constructor
	public LunchBag(double length, double width, double height, WaterBottle waterBottle) {

		// Sets values based on passed parameters
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}

	// Mutators and Accessors below
	public double getLength() {
		return length;
	}

	public void setLength(double length) {

		// If length is less than 0 set to default value
		if (length < 0) {
			setLength(11.2);
		} else {
			this.length = length;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {

		// If width is less than 0 set to default value
		if (width < 0) {
			setWidth(6.1);
		} else {
			this.width = width;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {

		// If width is less than 0 set to default value
		if (height < 0) {
			setHeight(7.9);
		} else {
			this.height = height;
		}
	}

	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) {

		// Checks if radius is greater than 0 and less than or equal to 4
		if (waterBottle.getRadius() * 2 > 0 && waterBottle.getRadius() * 2 <= 4) {
			this.waterBottle = waterBottle;
		} else { // Sets to default waterbottle
			System.out.println("Cannot store water bottle.");
			this.waterBottle = new WaterBottle();
		}
	}
}
