///*
// *  File: PAssign02.java
// *  Author: Seraphina Morrison
// *  Created: 01/28/2024
// *  Description: Build video card and computer classes, 
// *  create instances of them and print their descriptions in main
// */
//
//public class PAssign02 {
//	public static void main(String[] args) {
//		// Create instances of VideoCards
//		VideoCard videoCard2 = new VideoCard("discrete", "PCIEx16", 575, "8-pin", 24);
//		VideoCard videoCard3 = new VideoCard("integrated", "N/A", 120, "N/A", 4);
//		VideoCard videoCard4 = new VideoCard("discrete", "PCIEx8", 150, "6-pin", 8);
//		VideoCard videoCard5 = new VideoCard("integrated", "N/A", -110, "N/A", 2);
//
//		// Create computer objects
//		Computer computer1 = new Computer();
//		Computer computer2 = new Computer("Dell", "Optiplex", videoCard2);
//		Computer computer3 = new Computer("Lenovo", "IdeaCentre", videoCard3);
//		Computer computer4 = new Computer("HP", "Omen Obelisk", videoCard4);
//		Computer computer5 = new Computer("Lenovo", "IdeaCentre", videoCard5);
//
//		// Put computer instances into array
//		Computer[] computerArray = { computer1, computer2, computer3, computer4, computer5 };
//
//		// For loop to cycle through array and print requested info on instances
//		for (int i = 0; i < computerArray.length; i++) {
//			System.out.printf("%s", computerArray[i].getInfo());
//		}
//	}
//}
//
//class Computer {
//	// Data members
//	private String brand = "", model = "";
//	private VideoCard videoCard;
//
//	// Default no-args constructor
//	public Computer() {
//		this("OEM", "Basic", new VideoCard());
//	}
//
//	// Required constructor
//	public Computer(VideoCard videoCard) {
//		this();
//		setVideoCard(videoCard);
//	}
//
//	// Convenience constructor
//	public Computer(String brand, String model, VideoCard videoCard) {
//		setBrand(brand);
//		setModel(model);
//		setVideoCard(videoCard);
//	}
//
//	// Method that returns formatted string
//	public String getInfo() {
//		// Initialize and populate message
//		String message = "";
//		message = String.format("%s %s%nVideo Card Info:%n%s", getBrand(), getModel(), videoCard.getInfo());
//
//		return message;
//	}
//
//	// Acsessors and mutators
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public VideoCard getVideoCard() {
//		return videoCard;
//	}
//
//	public void setVideoCard(VideoCard videoCard) {
//		this.videoCard = videoCard;
//	}
//}
//
//class VideoCard {
//	// Data members
//	private String type = "", connectionType = "", externalPower = "";
//	private int powerRequirement, memorySize;
//
//	// Default no-args constructor
//	public VideoCard() {
//		this("integrated", "N/A", 100, "N/A", 1);
//	}
//
//	// Required constructor
//	public VideoCard(String type, String connectionType, int powerRequirement, String externalPower, int memorySize) {
//		setType(type);
//		setConnectionType(connectionType);
//		setPowerRequirement(powerRequirement);
//		setExternalPower(externalPower);
//		setMemorySize(memorySize);
//	}
//
//	// Method that returns formatted string
//	public String getInfo() {
//		// Initialize and populate message
//		String message = "";
//		message = String.format("Type: %s%nConnection: %s%n" + "Power: %dW%nExt Power: %s%nMemory: %dGB%n%n", getType(),
//				getConnectionType(), getPowerRequirement(), getExternalPower(), getMemorySize());
//
//		return message;
//	}
//
//	// Acsessors and mutators
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getConnectionType() {
//		return connectionType;
//	}
//
//	public void setConnectionType(String connectionType) {
//		this.connectionType = connectionType;
//	}
//
//	public int getPowerRequirement() {
//		return powerRequirement;
//	}
//
//	public void setPowerRequirement(int powerRequirement) {
//		// Error checking with range of 1-500
//		if (powerRequirement < 1) {
//			this.powerRequirement = 75;
//		} else if (powerRequirement > 500) {
//			this.powerRequirement = 400;
//		} else {
//			this.powerRequirement = powerRequirement;
//		}
//	}
//
//	public String getExternalPower() {
//		return externalPower;
//	}
//
//	public void setExternalPower(String externalPower) {
//		this.externalPower = externalPower;
//	}
//
//	public int getMemorySize() {
//		return memorySize;
//	}
//
//	public void setMemorySize(int memorySize) {
//		// Error checking with range of 1-16
//		if (memorySize < 1) {
//			this.memorySize = 1;
//		} else if (memorySize > 16) {
//			this.memorySize = 16;
//		} else {
//			this.memorySize = memorySize;
//		}
//	}
//}
package projects;


