package com.fita.team2.typecasting;

public class LowerToHigerConversion {

	public static void main(String[] args) {
		byte b = 10;
		short s = b;
		float f = s+55;
		long l = (long) (f + 100l);
		double d = l + 1000;
		
		char c = (char) f;
		System.out.println(c);
		
		System.out.println(b + "---" + s + "---" + f);
		System.out.println(l + "---" + d);

	}

}
