package com.fita.team2.exception;

public class ExceptionInMethod {

	public static void main(String[] args) {
		try {
			checkMethod();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void checkMethod() throws ArithmeticException,NullPointerException{
		System.out.println("Test");
		String name = null;
		if(name.equals("SHYAM"))
		throw new ArithmeticException("Null Pointer Exception thrown");
		else
			System.out.println(name.charAt(1));
		
	}

}
