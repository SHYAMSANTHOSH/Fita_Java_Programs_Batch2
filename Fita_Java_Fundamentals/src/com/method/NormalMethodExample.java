package com.fita.team2.method;

public class NormalMethodExample {
	public static void main(String[] args) {
		NormalMethodExample nor = new NormalMethodExample();
		nor.add(10,20);
		int c = nor.sub(30,20);
		System.out.println(c);
	}
	
	public void add(int c,int d) {
		System.out.println(c + d);
	}
	
	public int sub(int m,int n) {
		return m-n;
	}
}
