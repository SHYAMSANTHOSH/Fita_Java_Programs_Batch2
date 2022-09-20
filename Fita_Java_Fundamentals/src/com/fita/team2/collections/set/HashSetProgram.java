package com.fita.team2.collections.set;

import java.util.Collections;
import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>(10);
		hashset.add("Car");
		hashset.add("Bike");
		hashset.add("Bus");
		hashset.add("Van");
		hashset.add("Car1");
		System.out.println(hashset.size());
		Collections.addAll(hashset,"Shyam","Mani","Peter","Barani","Nagaraj","Saravana");
		
		System.out.println(hashset);
		System.out.println(hashset.size());

	}

}
