package com.fita.team2.callinglocalvariable;

import com.fita.team2.variable.LocalVariable;

public class CallLocalVariable {
	
	public static void main(String[] args) {
		LocalVariable loc = new LocalVariable();
		
		int localvalue = loc.display(); 
		System.out.println(localvalue);
		
	}

}
