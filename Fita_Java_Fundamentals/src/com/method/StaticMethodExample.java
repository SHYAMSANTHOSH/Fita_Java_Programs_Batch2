package com.fita.team2.method;

public class StaticMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(10,20);
		int c = sub(30,20);
		System.out.println(c);
	}
	
	static int sub(int i, int j) {
		return i-j;
	}

	static void add(int x,int y) {
		System.out.println(x + y);
	}

}
