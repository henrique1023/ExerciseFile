package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriter {

	public static void main(String[] args) {
		
		
		String[] lines = new String[] {"Good Morning", "IN line", "Jota quest"};
		
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
