package com.fita.team2.oops;

import java.util.Arrays;

public class Polymorphism {

	public static String csestudent[] = {"Shyam","Mani","Nagaraj"};
	public static String mechstudent[] = {"Anand","Surendhar","Saravana"};
	public static String csesubject[] = {"Java","Python","DBMS"};
	public static String mecsubject[] = {"Autocad","Engineering Graphics"};
	
	public static void department(String dept) {
		if(dept.equalsIgnoreCase("CSE")) {
			System.out.println(Arrays.toString(csestudent));
		}else {
			System.out.println(Arrays.toString(mechstudent));
		}
	}
	
	public static void department(String dept, String subject) {
		if(dept.equalsIgnoreCase("CSE")) {
			for(String value : csesubject) {
				if(value.equals(subject)) {
					System.out.println("Subject is present in the class");
				}else {
					System.out.println("Subject is not present");
				}
			}
		}else {
			System.out.println(Arrays.toString(mechstudent));

			for(String value : mecsubject) {
				if(value.equals(subject)) {
					System.out.println("Subject is present in the class");
				}else {
					System.out.println("Subject is not present");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		String dept = "CSE";
		String subject = "Java";
		department(dept);
		department(dept,subject);

	}
	

}
