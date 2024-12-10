import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer {

	private double seconds = 0;
	private JFrame frame = new JFrame();
	private JLabel label = new JLabel();
	private String display = "";

	public Timer(int newSeconds) {
		seconds = newSeconds;
	}

	public boolean stopWatch() {

		frame.setSize(300, 200);
		label.setText(display);

		while (seconds > 0) {
			display = display.format("%.2f", seconds);
			label.setText(display);
			frame.add(label);
			frame.setAlwaysOnTop(true);
			frame.setVisible(true);
			try {
				TimeUnit.MILLISECONDS.sleep(1);
				seconds -= .003;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		if (seconds < 0 && seconds > -5) {
			
			label.setText("KNIVES DOWN!");
			return true;
		}
		return true;
	}
	
	public void stopTicking() {
		String tempSeconds = display;
		label.setText("Finished with " + tempSeconds + " seconds to spare!");
		seconds = -6;
	}

}
