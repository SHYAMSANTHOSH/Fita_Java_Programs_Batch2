package com.fita.team2.string;

public class MutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Shyam");
		System.out.println(sb);
		sb.append(10);
		System.out.println(sb);
		String value = "Shyam10";
		System.out.println(sb.toString().intern() == value);
		System.out.println(sb.toString().equals(value));
		
		StringBuffer sbuf = new StringBuffer("Kumar");
		System.out.println(sbuf);
		sbuf.append(20);
		System.out.println(sbuf);
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		for(int i=0;i<100000;i++) {
			sbuf.append("Buffer");
		}
		
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - time) + "ms");  
		
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		for(int i=0;i<100000;i++) {
			sb.append("Builder");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - time1) + "ms");  
	}

}
