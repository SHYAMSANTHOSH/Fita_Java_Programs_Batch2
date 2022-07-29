package com.fita.team2.datatypes;

public class ConvertingDatatypes {

	public static void main(String[] args) {
		int i = 50;
		float f = 10.0f;
		String convertfloat = String.valueOf(f);
		String convertint = String.valueOf(i); // Convert Int to String
		
		String num = "10";
		byte convertStringtoByte = Byte.valueOf(num);
		System.out.println(convertStringtoByte);
	}

}
