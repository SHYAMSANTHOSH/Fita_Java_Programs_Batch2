package com.fita.team2.interfaces;

public class Rectangle implements Shape{


	int len = 10;
	int breadth = 20;
	
	public void getShape(int len,int breadth) {
		System.out.println(len+breadth);
	}
	
	public void getValue() {
		System.out.println(value);
	}
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		rec.getShape(rec.len, rec.breadth);
		rec.getValue();

	}

}
