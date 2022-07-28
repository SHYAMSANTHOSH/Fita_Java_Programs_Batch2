package com.fita.team2.modifier;

public class PrivateModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Test";
		
		PrivateModifier priv = new PrivateModifier();
		priv.Hello();
		
	}
	
	private void Hello() {
		System.out.print("Printing Private Value");
	}

}
