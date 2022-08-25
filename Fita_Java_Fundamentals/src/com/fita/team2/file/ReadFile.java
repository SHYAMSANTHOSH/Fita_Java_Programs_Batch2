package com.fita.team2.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File f = new File("F:\\Fita\\Batch2\\ReadFile.txt");
		try {
			Scanner s = new Scanner(f);
			String data = "";
			while(s.hasNextLine()) {
				data+= s.nextLine();
				data+="\n";
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
