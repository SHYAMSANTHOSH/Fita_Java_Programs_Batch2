package com.fita.team2.exception;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
		String name = "value";
		System.out.println(name.charAt(0));
		int a[] = {10,20,30};
		System.out.println(a[4]);
		}catch(ArrayStoreException e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
