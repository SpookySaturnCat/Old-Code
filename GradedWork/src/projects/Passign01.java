/*
 *  File: PAssign01.java
 *  Author: Seraphina Morrison
 *  Created: 1/20/24
 *  Class: CSCI 1302
 *  Description: Creates desk instances in main and prints
 *  their descriptions
 */
package projects;

public class Passign01 {
	public static void main(String[] args) {
		// Create desk objects
		Desk desk1 = new Desk(5, 43.50, "Birch", "Tennessee");
		Desk desk2 = new Desk(8, 29.20, "Mahogany", "California");
		Desk desk3 = new Desk(-12);
		Desk desk4 = new Desk(0, 88, "Maple", "New York");
		Desk desk5 = new Desk(2, 28.10, "no", "Washington");

		// Mutate values of desk objects
		desk1.setStanding(true);
		desk3.setSurfaceHeight(40.10);
		desk3.setManufactureState("Florida");
		desk3.setStanding(true);

		// Create an array of desks
		Desk[] desks = { desk1, desk2, desk3, desk4, desk5 };

		printDesks(desks); // Prints desks
	}

	public static void printDesks(Desk[] desks) {
		// For loop that prints information on all desks
		for (int i = 0; i < desks.length; i++) {
			System.out.printf("Desk %d%nDesk Information%n" + desks[i].getInfo(), i + 1);
		}
	}
}

class Desk {
	// Data members
	private int numDrawers;
	private double surfaceHeight;
	private boolean standing;
	private String materialType = "";
	private String manufacureState = "";
	private static int numDesks = 0;

	// Default no-args constructor
	public Desk() {
		// Sets default values
		setNumDrawers(4);
		setSurfaceHeight(27.0);
		setStanding(false);
		setMaterialType("Pine");
		setManufactureState("North Carolina");
		Desk.numDesks++;
	}

	// Required convenience constructor
	public Desk(int numDrawers) {
		this();
		setNumDrawers(numDrawers);
	}

	// Additional convenience constructor
	public Desk(int numDrawers, double surfaceHeight, String materialType, String manufactorState) {
		this(numDrawers);
		setSurfaceHeight(surfaceHeight);
		setMaterialType(materialType);
		setManufactureState(manufactorState);
	}

	// Method that returns a formatted string
	public String getInfo() {
		// Initialize string
		String message = "";

		// Populate message with formatted string
		message = String.format("Number Drawers:\t%d%n" 
						+ "Surface Height:\t%.2f inches%nStanding:\t%b%n"
						+ "Material:\t%s%nManufactured:\t%s%n%n",
				getNumDrawers(), getSurfaceHeight(), isStanding(),
				getMaterialType(), getManufactureState());

		return message; // Returns message
	}

	// Acsessors and mutators
	public int getNumDrawers() {
		return numDrawers;
	}

	public void setNumDrawers(int numDrawers) {
		// Checks to see if passed value is in range of 0-8 otherwise it defaults to 4
		if (numDrawers >= 0 && numDrawers <= 8) {
			this.numDrawers = numDrawers;
		} else {
			this.numDrawers = 4;
		}
	}

	public double getSurfaceHeight() {
		return surfaceHeight;
	}

	public void setSurfaceHeight(double surfaceHeight) {
		// Checks to see if passed value is in range of 24.0-45.0 otherwise it defaults to 27.0
		if (surfaceHeight >= 24.0 && surfaceHeight <= 45.0) {
			this.surfaceHeight = surfaceHeight;
		} else {
			this.surfaceHeight = 27.0;
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
		/* Checks to see if passed value is in at least 3 characters long,
		 * otherwise it defaults to Oak */
		if (materialType.length() >= 3) {
			this.materialType = materialType;
		} else {
			this.materialType = "Oak";
		}
	}

	public String getManufactureState() {
		return manufacureState;
	}

	public void setManufactureState(String manufactorState) {
		/* Checks to see if passed value is in at least 4 characters long,
		 * otherwise it defaults to Iowa */
		if (manufactorState.length() >= 4) {
			this.manufacureState = manufactorState;
		} else {
			this.manufacureState = "Iowa";
		}
	}

	public static int getNumDesks() {
		return numDesks;
	}
}
