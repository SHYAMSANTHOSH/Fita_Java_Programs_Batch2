package com.fita.team2.array;

public class BasicArray {

	public static void main(String[] args) {
		
		String[] name = new String[4];
		name[0] = "Shyam"; // String[] name = {"Shyam"};
		name[1] = "Kumar";
		name[2] = "Peter";
		name[3] = "Mani";
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("Prining Specific Value : " + name[2]);

	}

}
