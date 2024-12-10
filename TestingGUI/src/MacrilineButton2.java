
import java.awt.*;
import javax.swing.*;

public class MacrilineButton2 {

	MacrilineButton2() {
		
		//BUTTON WITH ICON ON BUTTON
		// Frame of pop up
		JFrame frame = new JFrame("Button Example");
		// Button for pop up
		JButton button = new JButton(new ImageIcon("src/marciline.jpg"));

		// Placement of the button
		button.setBounds(95, 125, 300, 350);
		frame.add(button);
		// (x,y) dimensions
		frame.setSize(500, 600);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		// Intresting when you move 
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new MacrilineButton2();
	}
}
