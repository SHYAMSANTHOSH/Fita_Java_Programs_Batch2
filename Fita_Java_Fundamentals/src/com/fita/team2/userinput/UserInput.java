package com.fita.team2.userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//int num = 100;
		System.out.println("User Input");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		char c = scan.nextLine().toCharArray()[3];
		int num = scan.nextInt();
		float b = scan.nextFloat();

		System.out.println(c);
		System.out.println(num + b);
		System.out.println(b);
		System.out.println(name);

	}

}
