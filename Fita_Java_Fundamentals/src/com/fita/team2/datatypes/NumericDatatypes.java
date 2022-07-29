package com.fita.team2.datatypes;

public class NumericDatatypes {

	public static void main(String[] args) {
		byte b = 100; // Maximum Support Value is -127 to 127
		System.out.println("Byte Value : " + b);
		
		short s = 	-32767;
		System.out.println("Short Value : " + s);

		int i = 2147483647;
		System.out.println("Int Value : " + i);
		
		long lo = 2147483648L;
		System.out.println("Long Value : " + lo);
	}

}
