package com.fita.team2.collections.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student implements Comparable<Student>{
	
	private int rollno;
    private String name;
    private String subject;
    private int marks;
    
    @Override
	public int compareTo(Student stud) {
		// TODO Auto-generated method stub
    	
		return (this.name.compareTo(stud.name));
	}
  	public Student(int rollno, String name, String subject, int marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[rollno=" + rollno + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
  	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(10,"Shyam","English",80));
		st.add(new Student(14,"Barani","Maths",98));
		st.add(new Student(5,"Nagaraj","Tamil",86));
		st.add(new Student(1,"Mani","Science",86));
		Collections.sort(st);
		for(Student stud : st) {
			System.out.print(stud.getRollno() + " ");
			System.out.print(stud.getName() + " ");
			System.out.print(stud.getSubject() + " ");
			System.out.print(stud.getMarks() + " \n");
		}

	}
	

}
