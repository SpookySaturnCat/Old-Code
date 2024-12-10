package labs.spring2024;

/*
 *  File: 02/23/2024
 *  Authors: Seraphina Morrison and Taylor O'Neal
 *  Created: 02/23/2024
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab06Prob02 {
	public static void main(String[] args) {
		File priceList = new File("src/pricelist.txt");

		try (Scanner input = new Scanner(priceList);) {
			if (priceList.exists()) {
				while (input.hasNext()) {
					System.out.printf("$%,.2f\n", input.nextDouble());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

