import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonTest {
	
	ButtonTest() {

		JFrame frame = new JFrame("Marciline.exe");
		ImageIcon icon = new ImageIcon("src/marciline.jpg");

		frame.setIconImage(icon.getImage());
		frame.setSize(300, 200);

		final JTextField textFeild = new JTextField();
		textFeild.setBounds(65, 55, 150, 25);
		JButton button = new JButton("Click Here");
		button.setBounds(90, 100, 95, 30);

		button.addActionListener((ActionListener) new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFeild.setText("Max is gay");
			}
		});

		frame.add(button);
		frame.add(textFeild);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		new ButtonTest();
	}
}
