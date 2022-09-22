package com.fita.team2.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProgram {

	public static void main(String[] args) {
		LinkedHashMap<Character, String> linkedhashmap = new LinkedHashMap<Character, String>();
		linkedhashmap.put('A', "All");
		linkedhashmap.put('P', "Praveen");
		linkedhashmap.put('C',"Catch");
		linkedhashmap.put('D', null);
		linkedhashmap.put('E', null);
		linkedhashmap.put(null, "ALL");
		linkedhashmap.put(null, "Data");
		linkedhashmap.put('D', "Deva");
		
		for(Map.Entry<Character, String> data : linkedhashmap.entrySet()) {
			System.out.println(data.getKey() + "-->" + data.getValue());
		}
		System.out.println("**********Get Key Data ****************");
		for(Character c : linkedhashmap.keySet()) {
			System.out.println(c);
		}
		
		System.out.println("*********** Get Value Data ************");
		for(String s : linkedhashmap.values()) {
			System.out.println(s);
		}
		
		System.out.println("********* Iterate For Loop ***********");
        Iterator<Map.Entry<Character, String>> it = linkedhashmap.entrySet().iterator(); 
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        Iterator<Character> ch = linkedhashmap.keySet().iterator();
        while(ch.hasNext()) {
        	System.out.println(ch.next());
        }
	}
}
