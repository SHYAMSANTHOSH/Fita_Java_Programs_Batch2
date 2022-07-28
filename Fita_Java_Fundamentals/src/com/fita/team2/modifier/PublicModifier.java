package com.fita.team2.modifier;

import com.fita.team2.variable.LocalVariable;

public class PublicModifier {

	public static void main(String[] args) {
		
		LocalVariable loc = new LocalVariable();
		int localvalue = loc.display();
		System.out.println(localvalue);

	}

}
