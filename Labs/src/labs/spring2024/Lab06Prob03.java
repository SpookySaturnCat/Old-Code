package labs.spring2024;

/*
 *  File: 02/23/2024
 *  Authors: Seraphina Morrison and Taylor O'Neal
 *  Created: 02/23/2024
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab06Prob03 {
	public static void main(String[] args) {
		File inputFile = new File("src/pricelist.txt");
		File outputFile = new File("src/ pricelist-lab06.txt");
		double currentPrice;
		
		try (
		Scanner input = new Scanner(inputFile);
		PrintWriter output = new PrintWriter(outputFile);
				) {
			
			if (inputFile.exists()) {
				
				while (input.hasNext()) {
					currentPrice = input.nextDouble();
					System.out.printf("$%,.2f\n", currentPrice);

					if (currentPrice < 50) {
						currentPrice = currentPrice + currentPrice / 6.25;
					} else if (currentPrice > 100) {
						currentPrice = currentPrice + currentPrice / 12.5;
					} else {
						currentPrice = currentPrice + currentPrice / 25;
					}
					
					output.printf("%.2f\n", currentPrice);
				}
			} else {
				throw new FileNotFoundException("womp womp");
			}
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
			
	}
}
