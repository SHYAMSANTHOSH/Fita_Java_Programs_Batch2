package com.fita.team2.loop;

import java.util.Scanner;

public class ForProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String name = scan.nextLine();
		char c = scan.nextLine().toCharArray()[2];
		System.out.println(name);

		System.out.println(c);
		int sum = 0;
		for(int i=0;i<num;i++) {
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("****************"+sum);
	}

}
