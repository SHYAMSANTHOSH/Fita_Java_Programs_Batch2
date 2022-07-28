package com.fita.team2.variable;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalVariable loc = new LocalVariable();
		int num = loc.display();
		int mark = 35;
		System.out.println(mark);
	}
	
	 protected int displayProtected() {
		int value = 100;
		System.out.println(value);
		return value;
	}
	 
	  public int display() {
			int value = 100;
			System.out.println(value);
			return value;
		}


}
