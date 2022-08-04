package com.fita.team2.loop;

public class SwitchProgram {

	public static void main(String[] args) {
		char c = 'E'; 
		int num = 100; //num == 100
		switch(c) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			case 'D':
				System.out.println("<--- D --->");
				break;
				
			default:
				System.out.println("False");
				break;
		}
	}

}
