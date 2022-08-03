package com.fita.team2.constructor;

public class AvoidCopyConstructor {

	int num;int num1;int copynum;int copynum1;
	public static void main(String[] args) {
		
		AvoidCopyConstructor av = new AvoidCopyConstructor(10,20);
		AvoidCopyConstructor av1 = new AvoidCopyConstructor(av); // Handled Copy Constructor with object name av
		av1.display();
	}
	
	public AvoidCopyConstructor(AvoidCopyConstructor av) {
		copynum = av.num;
		copynum1 = av.num1;
	}
	
	AvoidCopyConstructor(int i,int j){
		num = i;
		num1 = j;
	}
	
	public void display() {
		System.out.println(copynum);
		System.out.println(copynum1);
	}

}
