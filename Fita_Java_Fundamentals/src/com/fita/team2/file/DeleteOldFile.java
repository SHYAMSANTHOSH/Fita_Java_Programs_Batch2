package com.fita.team2.file;

import java.io.File;

public class DeleteOldFile {

	public static void main(String[] args) {
		File fi = new File("F:\\Fita\\Batch2\\");
		if(fi.exists()) {
			System.out.println("List of File before deleting");
			File[] list = fi.listFiles();
			for(File li : list) {
				System.out.println(li.getName());
			}
			System.out.println("List of File after deleting");
			 long Deletion = System.currentTimeMillis() - (1 * 24 * 60 * 60 * 1000);
			 for(File f1 : list) { 
				 if(f1.lastModified() < Deletion) { 
					 f1.delete(); 
				}else {
					System.out.println(f1.getName()); 
				}
			}
			 
		}
	}

}
