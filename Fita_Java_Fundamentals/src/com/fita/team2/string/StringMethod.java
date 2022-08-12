package com.fita.team2.string;

public class StringMethod {

	public static void main(String[] args) {
		String city = "ERODE,SALEM,TIRUPUR,METUPALAYAM";
		String name = "RAHUL DRAVID";
		String dept = "MECHANICAL";
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		System.out.println(name.format("%d", 10));
		System.out.println(name.format("Value of %s", name));
		System.out.println(name.substring(6, 12));
		System.out.println(name.contains("GANGULY"));
		if(dept.contains("CSE")) {
			System.out.println(name);
		}else {
			System.out.println("NULL");
		}
		String[] namesplit = city.split(",");
		System.out.println(namesplit[0]);
		System.out.println(namesplit[1]);
	}

}
