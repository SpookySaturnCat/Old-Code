package followingInClass;

public abstract class AudioDevice {
	private String name, type;
	private double volume;
	private boolean power;
	
	protected AudioDevice() {
		// For constructor chaining
		setPower(false);
	}
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
}
