package com.fita.team2.collections.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		
		Set<String> linkhash = new LinkedHashSet<String>();
		linkhash.add("Welcome");
		linkhash.add("Java");
		linkhash.add("Python");
		linkhash.add(".Net");
		linkhash.add("PHP");
		linkhash.add("Java");
		
		System.out.println(linkhash);
		

	}

}
