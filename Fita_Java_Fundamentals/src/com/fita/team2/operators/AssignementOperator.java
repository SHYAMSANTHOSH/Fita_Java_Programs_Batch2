package com.fita.team2.operators;

public class AssignementOperator {

	public static void main(String[] args) {
		
		int a = 100;
		System.out.println("= " +a);
		a += 10;
		System.out.println("+= " + a);
		a -= 10;
		System.out.println("-= " + a);
		a *= 8;
		System.out.println("*= " +a);
		a /= 10;
		System.out.println("/= " +a);
		a <<= 5; // 2 power 2 = 4
		System.out.println("<<<= " + a);
		a >>>= 4;
		System.out.println(">>>=" + a);

	}

}
