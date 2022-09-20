package com.fita.team2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListandSetProgram {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		
		li.add("Test");
		li.add("Welcome");
		li.add("Hai");
		li.add("Test");
		li.add("Hello");
		li.add(null);
		li.add(null);
		li.add("done");
		
		System.out.println(li);
		
		set.add("Test");
		set.add("Welcome");
		set.add("Hai");
		set.add("Test");
		set.add("Hello");
		set.add("final");
		set.add("null");
		set.add("null");
		set.add("done");
		
		System.out.println(set);

	}

}
