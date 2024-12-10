

import javax.swing.JOptionPane;
import java.util.Scanner;

public class beaconDialog {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String idk = JOptionPane.showInputDialog(null, "Do you" + " open it? (Answer true/false)",
				"You see a chest", JOptionPane.WARNING_MESSAGE);
		String foolOrNot = input.nextLine();

		
			JOptionPane.showInputDialog(null, "you are nothing but a" + " fool", "A NEW HAND TOUCHES THE BEACON",
					JOptionPane.ERROR_MESSAGE);
		
		}

	}
