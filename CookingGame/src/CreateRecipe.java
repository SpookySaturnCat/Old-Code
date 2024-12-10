import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateRecipe {

	private File cookBookFile = new File("src/cookbook.txt");
	private String recipeName;
	private int recipeLength = 0;
	private int indexOrder = 0;
	private int buttonIndex = 0;
	private Scanner input = null;
	private GridBagConstraints gbc = new GridBagConstraints();
	private int duration = 0;
	private boolean isDone = false;

	public CreateRecipe(String newRecipeName, int newDuration) {
		recipeName = newRecipeName;
		duration = newDuration;

	}

	public void cook() {
		
		Timer timer = new Timer(duration);
		
		// Open the file cookBookFile.
		try {
			input = new Scanner(cookBookFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Var for referencing the currentline in the file.
		String currentLine;

		// line count used to keep track of how
		int lineCount = 0;

		// Calc how many lines are in the recipe
		while (recipeLength == 0) {

			//
			currentLine = input.nextLine();

			if (currentLine.equals(recipeName)) {

				while (!currentLine.equals("--")) {
					currentLine = input.nextLine();

					if (!currentLine.equals("-") && !currentLine.equals("--")) {
						recipeLength++;
					}
				}

			}

		}

		String[] recipe = new String[recipeLength];

		// Refresh file for read reading.
		input.close();
		try {
			input = new Scanner(cookBookFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (input.hasNext()) {

			currentLine = input.nextLine();

			if (currentLine.equals(recipeName)) {

				while (!currentLine.equals("--")) {

					currentLine = input.nextLine();

					if (!currentLine.equals("-") && !currentLine.equals("--")) {
						recipe[lineCount] = currentLine;
						System.out.printf("%s%n", recipe[lineCount]);
						lineCount++;
					}
				}

			}

		}

		JFrame[] frame = new JFrame[recipeLength];
		JLabel[] label = new JLabel[recipeLength];
		JButton[] button = new JButton[recipeLength];
		JPanel[] panel = new JPanel[recipeLength];

		for (int i = 0; i < recipeLength; i++) {

			frame[i] = new JFrame();
			frame[i].setAlwaysOnTop(true);
			frame[i].setSize(200, 100);

			if (i == 0) {
				frame[0].setLocationRelativeTo(null);
			} else {

				frame[i].setLocation(
						frame[0].getX() + (int) ((Math.random() * (400)) - (int) ((Math.random() * (400)))),
						frame[0].getY() + (int) ((Math.random() * (400)) - (int) ((Math.random() * (400)))));
			}

			label[i] = new JLabel(recipe[i]);
			button[i] = new JButton("Use");
			panel[i] = new JPanel(new GridBagLayout());

			button[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					if (e.getSource() == button[indexOrder]) {
						indexOrder++;
						System.out.printf("%d of %d%n", indexOrder, recipeLength);

						if (indexOrder == recipeLength) {
							System.out.printf("Correct order!");
							timer.stopTicking();
							for (int i = 0; i < recipeLength; i++) {

								frame[i].dispose();
							}
						}

					} else {
						System.out.println("Wrong!");
					}

				}

			});

			// X and Y for adding the label.
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.fill = GridBagConstraints.VERTICAL;
			gbc.gridx = 0;
			gbc.gridy = 0;
			panel[i].add(label[i], gbc);

			// X and Y for adding the button.
			gbc.gridx = 0;
			gbc.gridy = 1;
			panel[i].add(button[i], gbc);

			frame[i].add(panel[i]);

			frame[i].setVisible(true);

		}
		
		isDone = timer.stopWatch();
		

		if (isDone && indexOrder != recipeLength) {

			for (int i = 0; i < frame.length; i++) {
				frame[i].dispose();
			}
		}

		if (isDone && indexOrder == recipeLength) {
			System.out.println("Sucess!");
		}

		}
	}
	