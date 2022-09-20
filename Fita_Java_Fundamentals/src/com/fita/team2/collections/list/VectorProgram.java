package com.fita.team2.collections.list;

import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>(3);
		vec.add("Test");
		vec.add("Hello");
		vec.addElement("Hai");
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		vec.add("Bye");
		vec.add("Bye");
		vec.add("Bye");
		System.out.println("After adding capacity : " + vec.size());
		System.out.println( vec.capacity());
		vec.add("Bye1");
		System.out.println( vec.capacity());
		for(String val:vec) {
			System.out.println(val);
		}
		//System.out.println("Remove first occourence of element Bye:" +  vec.remove("Bye"));
		for(String val:vec) {
			if(val.equals("Bye")) {
				vec.remove(val);
			}System.out.println(val);
		}
	}

}
