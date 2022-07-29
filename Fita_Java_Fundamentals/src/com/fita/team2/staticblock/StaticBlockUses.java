package com.fita.team2.staticblock;



public class StaticBlockUses {

	static int num = 50;
	static int num1 = 100;
	int num2 = 100;
	public static void hello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =11;
		System.out.println("Hello");
		System.out.println(num);
		System.out.println(StaticBlockUses.num);
	}
	
	
	static {
		int num3 = 10;
		System.out.println(num + "-> " + num1 + "->");
		System.out.println("Hai");
		System.out.println(num3);
		hello();
		
		System.out.println(10);
	}
	

}
