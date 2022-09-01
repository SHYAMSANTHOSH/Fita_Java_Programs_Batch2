package com.fita.team2.oops;

public class ClassAndObect {
	
	int rollno;
	String name;
	
	ClassAndObect(int num,String value){
		this.rollno = num;
		this.name = value;
	}
	
	public static void display(String val,int num) {
		System.out.println("Student roll no : " + num+ "name : " + val);
	}
	

	public static void main(String[] args) {
		ClassAndObect co = new ClassAndObect(70,"Shyam");
		co.display(co.name,co.rollno);
		ClassAndObect co1 = new ClassAndObect(69,"Barani");
		co.display(co1.name,co1.rollno);
	}


	

}
