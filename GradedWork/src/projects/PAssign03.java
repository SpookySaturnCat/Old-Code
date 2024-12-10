///*
// *  File: PAssign03.java
// *  Author: Seraphina Morrison
// *  Created: 02/16/2024
// *  Description: Build video card and computer classes, 
// *  create instances of them and print their descriptions in main
// */
package projects;

public class PAssign03 {
	public static void main(String[] args) {
		// Create instances of VideoCards
		VideoCard videoCard2 = new DiscreteVideoCard("PCIEx16", 400, "8-pin", 16);
		VideoCard videoCard3 = new IntegratedVideoCard(2, 120, false, 4);
		VideoCard videoCard4 = new DiscreteVideoCard("PCIEx8", 150, "6-pin", 8);
		VideoCard videoCard5 = new IntegratedVideoCard(2, -110, false, 3);

		// Create computer objects
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Dell", "Optiplex", videoCard2);
		Computer computer3 = new Computer("Lenovo", "IdeaCentre", videoCard3);
		Computer computer4 = new Computer("HP", "Omen Obelisk", videoCard4);
		Computer computer5 = new Computer("Lenovo", "IdeaCentre", videoCard5);

		// Put computer instances into array
		Computer[] computerArray = { computer1, computer2, computer3, computer4, computer5 };

		// For loop to cycle through array and print requested info on instances
		for (int i = 0; i < computerArray.length; i++) {
			System.out.printf("%s", computerArray[i]);
		}
	}
}

class Computer {
	// Data members
	private String brand = "", model = "";
	private VideoCard videoCard;

	// Default no-args constructor
	public Computer() {
		this("OEM", "Basic", new IntegratedVideoCard());
	}

	// Required constructor
	public Computer(VideoCard videoCard) {
		this();
		setVideoCard(videoCard);
	}

	// Convenience constructor
	public Computer(String brand, String model, VideoCard videoCard) {
		setBrand(brand);
		setModel(model);
		setVideoCard(videoCard);
	}

	// Method(s) that returns formatted string (they are the same but asked of in
	// description)
	public String getInfo() {
		// Initialize and populate message
		String message = "";
		message = String.format("%s %s%nVideo Card Info:%n%s", getBrand(), getModel(), this.videoCard.toString());

		return message;
	}

	public String toString() {
		// Initialize and populate message
		String message = "";
		message = String.format("%s %s%nVideo Card Info:%n%s", getBrand(), getModel(), this.videoCard.toString());

		return message;
	}

	// Acsessors and mutators
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public VideoCard getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}
}

class VideoCard {
	// Data members
	private String type = "", connectionType = "", externalPower = "";
	private int powerRequirement, memorySize;

	// Default no-args constructor
	public VideoCard() {
		this("integrated", "N/A", 100, "N/A", 1);
	}

	public VideoCard(String type) {
		this();
		setType(type);
	}

	// Required constructor
	public VideoCard(String type, String connectionType, int powerRequirement, String externalPower, int memorySize) {
		setType(type);
		setConnectionType(connectionType);
		setPowerRequirement(powerRequirement);
		setExternalPower(externalPower);
		setMemorySize(memorySize);
	}

	public VideoCard(String type, int powerRequirements, int memorySize) {
		this(type);
		setPowerRequirement(powerRequirements);
		setMemorySize(memorySize);
	}

	// Returns an updated string
	public String toString() {
		String message = "";
		message = String.format("Type: %s\nPower: %d W\nMemory: %d GB\n\n", getType(), getPowerRequirement(),
				getMemorySize());
		return message;
	}

	// Method that returns formatted string
	public String getInfo() {
		// Initialize and populate message
		String message = "";
		message = String.format("Type: %s%nConnection: %s%n" + "Power: %dW%nExt Power: %s%nMemory: %dGB%n%n", getType(),
				getConnectionType(), getPowerRequirement(), getExternalPower(), getMemorySize());

		return message;
	}

	// Acsessors and mutators
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public int getPowerRequirement() {
		return powerRequirement;
	}

	public void setPowerRequirement(int powerRequirement) {
		// Error checking with range of 1-500
		if (powerRequirement < 1) {
			this.powerRequirement = 75;
		} else if (powerRequirement > 500) {
			this.powerRequirement = 400;
		} else {
			this.powerRequirement = powerRequirement;
		}
	}

	public String getExternalPower() {
		return externalPower;
	}

	public void setExternalPower(String externalPower) {
		this.externalPower = externalPower;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		// Error checking with range of 1-16
		if (memorySize < 1) {
			this.memorySize = 1;
		} else if (memorySize > 16) {
			this.memorySize = 16;
		} else {
			this.memorySize = memorySize;
		}
	}
}

class DiscreteVideoCard extends VideoCard {
	// Data members
	private String connectionType, usesExternalPower;

	// Default no-args constructor
	public DiscreteVideoCard() {
		super("discrete");
		setConnectionType("PCIEx8");
		setUsesExternalPower("6-pin");
	}

	public DiscreteVideoCard(String connectionType, String usesExternalPower) {
		this();
		setConnectionType(connectionType);
		setUsesExternalPower(usesExternalPower);
	}

	public DiscreteVideoCard(String connectionType, int power, String usesExternalPower, int memory) {
		super("discrete", power, memory);
		setConnectionType(connectionType);
		setUsesExternalPower(usesExternalPower);
	}

	@Override
	public String toString() {
		String message = String.format("%sConnection: %s\nExternal Power: %s\n\n", super.toString(),
				getConnectionType(), getUsesExternalPower());
		return message;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getUsesExternalPower() {
		return usesExternalPower;
	}

	public void setUsesExternalPower(String usesExternalPower) {
		this.usesExternalPower = usesExternalPower;
	}
}

class IntegratedVideoCard extends VideoCard {
	// Data members
	private int sharedMemory;
	private boolean usesComputerRAM;

	// Default no-args constructor
	public IntegratedVideoCard() {
		super();
		setSharedMemory(2);
		setUsesComputerRAM(false);
	}

	public IntegratedVideoCard(int memory, boolean ram) {
		super();
		setSharedMemory(memory);
		setUsesComputerRAM(ram);
	}

	public IntegratedVideoCard(int sharedMemory, int power, boolean usesComputerRam, int memory) {
		super("integrated", power, memory);
		setSharedMemory(sharedMemory);
		setUsesComputerRAM(usesComputerRAM);
	}

	@Override
	public String toString() {
		String message = String.format("%sShared Memory: %d GB\n" + "Computer RAM: %b\n\n", super.toString(),
				getSharedMemory(), getUsesComputerRAM());
		return message;
	}

	public int getSharedMemory() {
		return sharedMemory;
	}

	public void setSharedMemory(int sharedMemory) {
		this.sharedMemory = sharedMemory;
	}

	public boolean getUsesComputerRAM() {
		return usesComputerRAM;
	}

	public void setUsesComputerRAM(boolean usesComputerRAM) {
		this.usesComputerRAM = usesComputerRAM;
	}
	// Sorry about the lack of comments tbh I forgot about this.....
}
