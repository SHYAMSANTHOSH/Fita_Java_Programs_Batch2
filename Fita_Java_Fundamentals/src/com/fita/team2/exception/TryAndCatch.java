package com.fita.team2.exception;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Completed");
		}
		System.out.println("Ater Finally");
		
	}

}
