
public class PAssign02 {

	// Main method
	public static void main(String[] args) {

		// Create VideoCard objects
		VideoCard videoCard2 = new VideoCard("discrete", "PCIEx16", 575, "8-pin", 24);
		VideoCard videoCard3 = new VideoCard("integrated", "Beep", 120, "Boop", 4);
		VideoCard videoCard4 = new VideoCard("discrete", "PCIEx8", 150, "6-pin", 8);
		VideoCard videoCard5 = new VideoCard("integrated", "Boop", -110, "Beep", 2);
		
		// Create Computer objects
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Dell", "Optiplex", videoCard2);
		Computer computer3 = new Computer("Lenovo", "IdeaCentre", videoCard3);
		Computer computer4 = new Computer("HP", "Omen Obelisk", videoCard4);
		Computer computer5 = new Computer("Lenovo", "IdeaCentre", videoCard5);
		
		// Make array of computers
		Computer[] computer = { computer1, computer2, computer3, computer4, computer5};
		
		// Print information about computers
		for (int i = 0; i < computer.length; i ++) {
			System.out.println(computer[i].getInfo());
		}
	}
}

	// Computer class
	class Computer {

		// Data members
		private String brand = "";
		private String model = "";
		private VideoCard videoCard;

		// Default no-args constructor
		public Computer() {

			// Mutates instance member values to provided values
			setBrand("OEM");
			setModel("Basic");
			setVideoCard(new VideoCard());
		}

		// Required convenience constructor
		public Computer(VideoCard videoCard) {

			this(); // Default constructor
			setVideoCard(videoCard); // Mutate videoCard with pp
		}

		// Convenience constructor to set all members through passed values
		public Computer(String brand, String model, VideoCard videoCard) {

			// Mutates instance member values to passed values
			setBrand(brand);
			setModel(model);
			setVideoCard(videoCard);
		}
		
		// Method that returns info on videoCard
		public String getInfo() {
			return String.format("%s %s%n%s", getBrand(), getModel(), videoCard.getInfo());
		}

		// Mutators and acsessor
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

	// VideoCard class
	class VideoCard {

		// Data members
		private String type = "";
		private String connectionType = "";
		private int powerRequirement;
		private String externalPower;
		private int memorySize;

		// Default no-args constructor
		public VideoCard() {
			
			// Mutate instance members to default values
			setType("integrated");
			setConnectionType("N/A");
			setPowerRequirement(100);
			setExternalPower("N/A");
			setMemorySize(1);
		}

		// Required convenience constructor
		public VideoCard(String type, String cType, int powerR, String extPower, int memory) {

			// Mutate instance variables to passed values
			setType(type);
			setConnectionType(cType);
			setPowerRequirement(powerR);
			setExternalPower(extPower);
			setMemorySize(memory);
		}

		// Method that returns formatted information string
		
		public String getInfo() {
			return String.format("Video Card Info:%nType: %s%nConnection: %s%n"
					+ "Power: %dW%nExt Power: %s%nMemory: %dGB%n"
					, getType(), getConnectionType(), getPowerRequirement(),
					getExternalPower(), getMemorySize());
			
		}

		// Accessors and mutators below
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

			// If the type is integrated give the connection type n/a value
			if (this.type.equals("integrated")) {
				this.connectionType = "N/A";
			} else {
				this.connectionType = connectionType;
			}
		}

		public int getPowerRequirement() {
			return powerRequirement;
		}

		public void setPowerRequirement(int powerRequirement) {

			// If in the larger/equal to 1 and less than 500/equal to set to passed value
			if (powerRequirement >= 1 && powerRequirement <= 500) {
				this.powerRequirement = powerRequirement;
			}
			
			// If larger than 500 set to 400
			if (powerRequirement > 500) {
				setPowerRequirement(400);
			}
			
			// If less than one set to 75
			if (powerRequirement < 1) {
				setPowerRequirement(75);
			}
		}

		public String getExternalPower() {
			return externalPower;
		}

		public void setExternalPower(String externalPower) {

			if (this.type.equals("integrated")) {
				this.externalPower = "N/A";
			} else {
				this.externalPower = externalPower;
			}
		}

		public int getMemorySize() {
			return memorySize;
		}

		public void setMemorySize(int memorySize) {

			// If greater than/equal to 1 and less than/equal to 16 set as passed value
			if (memorySize >= 1 && memorySize <= 16) {
				this.memorySize = memorySize;
			}

			// If larger than 16 set to 16
			if (memorySize > 16) {
				setMemorySize(16);
 			}

			// If less than 1 set to 1
			if (memorySize < 1) {
				setMemorySize(1);
			}
		}
	}
