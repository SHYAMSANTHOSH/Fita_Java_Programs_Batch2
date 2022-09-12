package com.fita.team2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {
	
	public  List<String> callMethod(){
		List<String> studentlist = new ArrayList<String>();
		studentlist.add("Dheena");
		studentlist.add("Vishnu");
		studentlist.add("Ajith");
		studentlist.add("Kamalesh");
		return studentlist;
	}
	

	public static void main(String[] args) {
		
		List<String> studentlist = new ArrayList<String>();
		studentlist.add("Dheena");
		studentlist.add("Vishnu");
		studentlist.add("Ajith");
		studentlist.add("Kamalesh");
		studentlist.add("Saravanan");
		
		Collections.sort(studentlist);
		
		System.out.println(studentlist.get(2));  // Retrieve Specific Value
		
		studentlist.add(3, "Logu");
		Iterator it = studentlist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		studentlist.remove(4);
		Iterator it1 = studentlist.iterator();
	
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		
	}

}
