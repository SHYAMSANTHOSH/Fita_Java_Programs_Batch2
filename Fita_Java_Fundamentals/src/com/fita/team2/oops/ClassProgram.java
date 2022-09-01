package com.fita.team2.oops;

public class ClassProgram {

	String clgname = "Sri Krishna";
	public static void clgDisplay(String name) {
		System.out.println(name + " College of Technology");
	}
	public static void main(String[] args) {
		
		ClassProgram cp = new ClassProgram();
		cp.clgDisplay(cp.clgname);
	}

}
