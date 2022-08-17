package com.fita.team2.string;

public class StringExample {

	public static void main(String[] args) {
		char[] ch = {'W','E','L','C','O','M','E'};

		String name = new String(ch);
		
		System.out.println(name);
		
		String city = "COIMBATORE";
		String city1 = new String("COIMBATORE").intern();
		String city2 = "COIMBATORE";
		String city3 = new String("COIMBATORE");
		String city4 = new String(city2);
		
		System.out.println(city == city2);
		System.out.println(city == city1); // true
		System.out.println(city == city4);
		System.out.println(city3 == city4);
		System.out.println(city.equals(city2));
		System.out.println(city.equals(city1));
		System.out.println(city.equals(city4));
		System.out.println(city.equals("COIMBATORE"));
		System.out.println(city3.equals(city4));
		
	}

}
