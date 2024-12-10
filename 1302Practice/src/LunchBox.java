
public class LunchBox {

	// Data members
	private double length;
	private double width;
	private double height;
	private WaterBottle waterBottle;
	
	// Default no-args constructor
	public LunchBox() {
		
		// Default given values
		setLength(10.6);
		setWidth(7.7);
		setHeight(6.33);
		setWaterBottle(new WaterBottle(4, 0.9));
	}
	
	// Convenience constructor
	public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
		
		// Mutate values through passed parameters
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}

	// Mutators and accessors below
	public double getLength() {
		return length;
	}

	public void setLength(double length) {

		// If length is greater than 0 set to pp, if not default
		this.length = (length > 0) ? (length) : 10.6; 
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		
		// If width is greater than 0 set to pp, if not default
		this.width = (width > 0) ? (width) : 7.7;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		
		// If height is greater than 0 set to pp, if not default
		this.height = (height > 0) ? height : 6.33;
	}

	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) {

		/* 
		 *  Makes sure bottles height is two less than box's height
		 *  and the diameter of the bottle is less than 25% of the 
		 *  box's width.
		 */
		if (waterBottle.getHeight() + 2 <= height
				&& waterBottle.getRadius() * 2 < width / 4.0) {
			this.waterBottle = waterBottle;
		} else { // Sets to default bottle
			System.out.println("Cannot store waterbottle.");
			this.waterBottle = new WaterBottle(4, 0.9);
		}
	}
}
