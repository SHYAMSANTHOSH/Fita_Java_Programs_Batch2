package com.fita.team2.oops.multipleinheritancewithinterface;

public class ChildClass implements Parent1,Parent2{

	public void common() {
		System.out.println("Success");
	}
	public void commonvalue() {
		System.out.println("Completed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass ch = new ChildClass();
		ch.common();
		ch.commonvalue();
		System.out.println(value);
	}

}
