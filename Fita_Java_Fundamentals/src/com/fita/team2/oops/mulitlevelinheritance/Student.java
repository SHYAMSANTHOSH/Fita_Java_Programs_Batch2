package com.fita.team2.oops.mulitlevelinheritance;

public class Student extends Department{

	int num = regnum; //987
	String departmentdetails = dept; // CSE
	String name = studname; // MANI
	
	public Student() {
		System.out.println("Student Details");
	}
	
	public Student(int number,String dep,String stname) {
		this.num = number;
		this.departmentdetails = dep;
		this.name = stname;
	}
	
	public void StudentAll() {
		System.out.println(name + " is belongs to " + departmentdetails + " Department and his register number is " + num);
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		Student st1 = new Student(987,"CSE","MANI");
		st1.modifyvalue(st1.num,st1.dept,st1.studname);
		System.out.println(st.departmentdetails);
		st1.StudentAll();
		
		Department de= new Student();
		de.Studentdetails();
		de.display();
		System.out.println();
	}

}
