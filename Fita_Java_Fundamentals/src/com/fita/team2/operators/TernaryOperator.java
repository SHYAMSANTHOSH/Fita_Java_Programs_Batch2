package com.fita.team2.operators;

public class TernaryOperator {
	public static void main(String[] args) {
		
		// ? :
		int a = 10;
		int b= 20;
		int c = 30;
		
		//System.out.println(a>=10?"Hello":"Hai");
		/*
		 * if(a > 15) { if(b> 20) { System.out.println("Hai"); }else {
		 * System.out.println("Hello"); } }else { if(c >= 30) {
		 * System.out.println("OK"); }else { System.out.println("cool"); } }
		 */
		
		System.out.println(a>5 ? b>=20?"hai":"hello":c>=30?"Ok":"cool");
	}
}
