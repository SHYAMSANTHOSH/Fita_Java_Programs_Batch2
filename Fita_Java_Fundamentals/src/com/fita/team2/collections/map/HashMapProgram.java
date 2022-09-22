package com.fita.team2.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		HashMap<Character, String> hashmap = new HashMap<Character, String>();
		hashmap.put('A', "All");
		hashmap.put('P', "Praveen");
		hashmap.put('C',"Catch");
		hashmap.put('D', null);
		hashmap.put('E', null);
		hashmap.put(null, "ALL");
		hashmap.put(null, "Data");
		hashmap.put('D', "Deva");
		
		for(Map.Entry<Character, String> data : hashmap.entrySet()) {
			System.out.println(data.getKey() + "-->" + data.getValue());
		}
		System.out.println("**********Get Key Data ****************");
		for(Character c : hashmap.keySet()) {
			System.out.println(c);
		}
		
		System.out.println("*********** Get Value Data ************");
		for(String s : hashmap.values()) {
			System.out.println(s);
		}
		
		System.out.println("********* Iterate For Loop ***********");
        Iterator<Map.Entry<Character, String>> it = hashmap.entrySet().iterator(); 
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        Iterator<Character> ch = hashmap.keySet().iterator();
        while(ch.hasNext()) {
        	System.out.println(ch.next());
        }
        
	}

}
