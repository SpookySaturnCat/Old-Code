
public class PAssign01 {

	public static void main(String[] args) {
		
		// Create objects
		Desk desk1 = new Desk(5, 43.5, true, "Birch", "Tennessee");
		Desk desk2 = new Desk(8, 29.2, false, "Mahogany", "California");
		Desk desk3 = new Desk(-2, 40.1, true, "Pine", "Florida");
		Desk desk4 = new Desk(0, 20, false, "Maple", "New York");
		Desk desk5 = new Desk(2, 28.1, false, "no", "Washington");
		
		// Make array of objects
		Desk[] arr = {desk1, desk2, desk3, desk4, desk5};
		
		// Print results
		printDesks(arr);
	}
	
	// Prints information from an array of Desk objects
	public static void printDesks(Desk[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Desk %d%n%s%n", i + 1, array[i].getInfo());
		}
	}
}

	class Desk {

	// Data members
	private int numDrawers;
	private double surfaceHeight;
	private boolean standing;
	private String materialType = "";
	private String manufactureState = "";
	private static int numDesks;

	// No-arg default constructor
	public Desk() {

		// Mutate values of data members
		setNumDrawers(4);
		setSurfaceHeight(27.0);
		setStanding(false);
		setMaterialType("Pine");
		setManufactureState("North Carolina");

		numDesks++; // Increase count by one
	}

	// Required convenience constructor
	public Desk(int numDrawers) {

		this(); // Calls the default constructor to populate values
		setNumDrawers(numDrawers); // Mutates numDrawers trough parameter
	}
	
	// Convenience constructor to set all values
	public Desk(int numDrawers, double surfaceHeight, boolean standing,
			String materialType, String manufactorState) {
		
		// Calls convenience constructor to update numDrawers and numDesks
		this(numDrawers);
		
		// Mutate data members
		setSurfaceHeight(surfaceHeight);
		setStanding(standing);
		setMaterialType(materialType);
		setManufactureState(manufactorState);
		
	}

	// Returns a formatted String with request information
	public String getInfo() {

		return String.format("Desk Information%nNumber Drawers:\t%d%n"
					+ "Surface Height:\t%.2f inches%nStanding:\t%b%n"
					+ "Material:\t%s%nManufactured:\t%s%n",
					getNumDrawers(), getSurfaceHeight(),
					isStanding(), getMaterialType(), getManufactureState());
	}

	// Accessors and mutators
	public int getNumDrawers() {
		return numDrawers;
	}

	public void setNumDrawers(int numDrawers) {

		// Checks to see if passed parameter is within given range
		if (numDrawers >= 0 && numDrawers <= 8) {
			this.numDrawers = numDrawers;
		} else {
			setNumDrawers(4);
		}
	}

	public double getSurfaceHeight() {
		return surfaceHeight;
	}

	public void setSurfaceHeight(double surfaceHeight) {

		// Checks to see if passed parameter is within given range
		if (surfaceHeight >= 24.0 && surfaceHeight <= 45.0) {
			this.surfaceHeight = surfaceHeight;
		} else {
			setSurfaceHeight(27);
		}
	}

	public boolean isStanding() {
		return standing;
	}

	public void setStanding(boolean standing) {
		this.standing = standing;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {

		// If the length of passed parameter is less than three set new value
		if (materialType.length() < 3) {
			setMaterialType("Oak");
		} else {
			this.materialType = materialType;
		}
	}

	public String getManufactureState() {
		return manufactureState;
	}

	public void setManufactureState(String manufactureState) {

		// If the length of passed parameter is less than four set new value
		if (manufactureState.length() < 4) {
			setManufactureState("Iowa");
		} else {
			this.manufactureState = manufactureState;
		}
	}

	public static int getNumDesks() {
		return numDesks;
	}
}
