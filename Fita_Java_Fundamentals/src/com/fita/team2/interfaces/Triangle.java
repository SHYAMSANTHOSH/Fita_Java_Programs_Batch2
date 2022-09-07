package com.fita.team2.interfaces;

public class Triangle implements Shape {

	int len = 50;
	int breadth = 40;
	int height = 30;
	
	public void getShape(int len,int breadth) {
		System.out.println(len+breadth+height);
	}
	
	public void getValue() {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		Triangle tr = new Triangle();
		tr.getShape(tr.len, tr.breadth);
		tr.getValue();

	}

}
