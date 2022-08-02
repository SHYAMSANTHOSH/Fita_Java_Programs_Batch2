package com.fita.team2.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int num = 100;
		int num1 = 200;
		int value = 499; // -500 -200
		int x = -458;
		int neg = 200; // -201
		
		System.out.println("Unary Value of Postfix : " + num++);System.out.println(num);
		System.out.println(num++);System.out.println(num);
		System.out.println("Unary Value of Prefix : " + --num1);
		System.out.println(--num);
		
		System.out.println(num++);
		
		if(value != 500) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		
		System.out.println(~neg);
		System.out.println(~x); //457
	}

}
