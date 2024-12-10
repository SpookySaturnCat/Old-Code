package followingInClass;

public class Radio extends AudioDevice {
	private String band;
	private double frequencey;
	
	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public double getFrequencey() {
		return frequencey;
	}

	public void setFrequencey(double frequencey) {
		this.frequencey = frequencey;
	}

	public Radio() {
		powerOn();
		setBand("FM");
		setVolume(9);
	}

	@Override
	public void powerOn() {
		setVolume(getVolume());

	}

	@Override
	public void powerOff() {
		setVolume(0.0);

	}

}
