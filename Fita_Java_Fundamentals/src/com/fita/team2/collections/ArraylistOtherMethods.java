package com.fita.team2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistOtherMethods extends ArrayListProgram{

	public static void main(String[] args) {
		
		ArraylistOtherMethods ap = new ArraylistOtherMethods();
		ap.callMethod();
		List<String> studentlist = new ArrayList<String>();
		
		Collections.addAll(studentlist,"Shyam","Mani","Peter","Barani");
		
		for(String s : studentlist) {
			System.out.println(s);
		}

	}

}
