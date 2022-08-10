package com.fita.team2.array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] rollno = new int[length];
		for(int i=0;i<length;i++) {
			rollno[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
	}

}
