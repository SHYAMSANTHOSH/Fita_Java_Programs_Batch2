package com.fita.team2.loop;

public class ContinueProgram {

	public static void main(String[] args) {
		
		int num = 10;
		int count = 0;
		while(num <=50) {
			System.out.println(num);
			if(num == 30)
				continue;
			System.out.println("Test " + count);
			num = num+10;
			count++;
		}

	}

}
