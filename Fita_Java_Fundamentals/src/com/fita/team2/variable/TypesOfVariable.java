package com.fita.team2.variable;

public class TypesOfVariable {
	

	public static void main(String[] args) {
		/*
		 3 Types of Variable -> Local Variable, Instance Variable, Class or Static Variable
		 */
		int num = 200;
		System.out.println("Class Variable Value is : " + TypesOfVariable.num);
		int a = 10; //Instance Variable
		
		System.out.println("Instance Variable Value is : " + a);
		
		TypesOfVariable ty = new TypesOfVariable();
		ty.sum();
	}

	public void sum() {
		int x = 10; // Local Variable
		int y = 20;
		int c = x + y;
		System.out.println(y + x + "Local Variable value is : " + x + y);
	}

	static int num = 100;
}
