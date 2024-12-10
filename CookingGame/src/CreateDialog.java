import java.awt.Color;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class CreateDialog {

	private String[] dialog;
	private int[] timing;
	private int[] size = new int[2];
	private JFrame[] frame;
	private JLabel[] label;

	public CreateDialog() {
		dialog[0] = "Default";
		timing[0] = 2;
		size[0] = 200;
		size[1] = 200;
		frame = new JFrame[dialog.length];
		label = new JLabel[dialog.length];
	}

	public CreateDialog(String[] newDialog, int[] newTiming, int[] newSize) {
		setDialog(newDialog);
		setTiming(newTiming);
		setSize(newSize);
		frame = new JFrame[newDialog.length];
		label = new JLabel[newDialog.length];
		
	}

	public void setDialog(String[] newDialog) {
		dialog = newDialog;
	}

	public String[] getDialog() {
		return dialog;
	}

	public void setTiming(int[] newTiming) {
		if (newTiming.length != dialog.length) {
			int[] fixedTiming = new int[dialog.length];
			
			for (int i = 0; i < dialog.length; i++) {
				fixedTiming[i] = 2;
				
				timing = fixedTiming;
			}
		} else {
			timing = newTiming;
		}
	}

	public int[] getTiming() {
		return timing;
	}

	public void setSize(int[] newSize) {
		size = newSize;
	}

	public int[] getSize() {
		return size;
	}

	public void displayDialog() {
		
		for (int i = 0; i < dialog.length; i++) {
			
			frame[i] = new JFrame();
			
			frame[i].setSize(size[0], size[1]);
			
			if (i == 0) {
				frame[0].setLocationRelativeTo(null);
			} else {
			
				frame[i].setLocation(frame[0].getX() + (int) ((Math.random() * (100 - 50)) + 50), frame[0].getY() + (int) ((Math.random() * (50 - 30)) + 30));
			}
			
			label[i] = new JLabel(dialog[i]);
			label[i].setBounds(0, 0, size[0], size[1]);
			
			frame[i].add(label[i]);
		
			// Not sure what setLayout does need to look into it.
			frame[i].setLayout(null);

			// Displays the frame.
			frame[i].setVisible(true);

			// Try and catch for waiting two seconds.
			try {
				TimeUnit.SECONDS.sleep(timing[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
