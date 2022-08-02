package com.fita.team2.operators;

public class ShiftOperator {

	public static void main(String[] args) {
		
		
		int value = 20;
		int value1 = 40;
		int num = -20;
		
		System.out.println(value>>4); // Right Shift (Division)
		System.out.println(value1 << 3); // Left Shift (Multiplication)
		
		System.out.println(num >>> 5);
		System.out.println(value >>> 5);

	}

}
