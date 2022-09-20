package com.fita.team2.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {

	public static void main(String[] args) {
		
		ArrayList<FitaStudent> arrlist = new ArrayList<FitaStudent>();
		arrlist.add(new FitaStudent("Rahul", 10, "DBMS"));
		arrlist.add(new FitaStudent("Sushmita", 19, "QA"));
		arrlist.add(new FitaStudent("Madhu", 11, "Python"));
		arrlist.add(new FitaStudent("Kamalesh", 7, ".Net"));
		arrlist.add(new FitaStudent("Logu", 20, "C++"));
		arrlist.add(new FitaStudent("Dheena", 32, "SQL"));
		arrlist.add(new FitaStudent("Shyam", 3, "Prog"));
		
		System.out.println(arrlist);
		
		System.out.println("************Sorting Name :***********");
		Collections.sort(arrlist, new GetName());
		for(FitaStudent f:arrlist) {
			System.out.println(f);
		}
		
		System.out.println("***********Sorting Number :*************");
		Collections.sort(arrlist, new GetNumber());
		for(FitaStudent f:arrlist) {
			System.out.println(f);
		}
		
		System.out.println("***********Sorting Subject :********");
		Collections.sort(arrlist, new GetSubject());
		for(FitaStudent f:arrlist) {
			System.out.println(f);
		}
		
	}

}
