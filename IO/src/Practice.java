
import java.io.*;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
	File saveFile = new File("src/saveFile.txt");
	User player = new User();
	
	
	if (saveFile.exists()) {
		
		saveFile.delete();
	}
	
	try {
		PrintWriter output = new PrintWriter(saveFile);
		
		output.printf("Name: %s", player.getName());
		output.close();
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("File written, program terminated.");

	}
	
}
