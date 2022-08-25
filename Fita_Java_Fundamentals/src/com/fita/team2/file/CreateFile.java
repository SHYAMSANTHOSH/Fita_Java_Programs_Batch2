package com.fita.team2.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File f = new File("F:\\Fita\\Batch2\\WelcomeBatch2.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File has been created");
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Shyam : " + e.getMessage());
		}

	}

}
