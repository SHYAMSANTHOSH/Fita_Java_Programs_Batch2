package com.fita.team2.oops.mulitlevelinheritance;

public class College {
	
	String collegename = "Sri Krishna College of technology";
	int registernum = 98123456;
	String studname = "Shyam";
	String dept = "MECH";
	
	College(){
		System.out.println("College Class is displayed");
	}
	
	public void Studentdetails() {
		System.out.println("Student Details");
	
	}
	
	public void modifyvalue(int rollnumber,String dep,String name){
		this.registernum = rollnumber;
		this.dept = dep;
		this.studname = name;
	}
	
}
