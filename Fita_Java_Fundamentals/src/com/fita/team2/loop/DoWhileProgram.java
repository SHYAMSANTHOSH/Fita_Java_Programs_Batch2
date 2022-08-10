package com.fita.team2.loop;

public class DoWhileProgram {

	public static void main(String[] args) {
		int value = 11;
		int count = 5;
		do {
			System.out.println("Hai" + count);
			if(count == 7)
				break;
			count++;
		}while(count <= 10);

	}

}
