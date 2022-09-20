package com.fita.team2.collections.comparator;

public class FitaStudent {
	
	String name;
	int number;
	String subject;
	
	public FitaStudent(String name, int number, String subject) {
		this.name = name;
		this.number = number;
		this.subject = subject;
	}


	public String toString() {
		return  this.name + " " +this.number+ " " + this.subject;
	}
	
	
	

}
