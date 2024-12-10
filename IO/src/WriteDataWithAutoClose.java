/**
 * File: ch12/WriteDataWithAutoClose.java
 * Package: 
 * @author Christopher Williams
 * Created on: Apr 18, 2016
 * Last Modified: Jul 15, 2019
 * Description:  Show example of using try-with-resources  
 */

import java.io.*;

public class WriteDataWithAutoClose {
	public static void main(String[] args) {
		File file = new File("src/scores.txt");
		if (file.exists()) {
			//			System.out.println("File already exists");
			//			System.exit(0);
			// auto-delete file for convenience
			file.delete();
		}

		try (	// use try-with-resources to auto-close any resources created here
				PrintWriter output = new PrintWriter(file);
		) {
			// Write formatted output to the file
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
			System.out.println("File written, program terminated.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}