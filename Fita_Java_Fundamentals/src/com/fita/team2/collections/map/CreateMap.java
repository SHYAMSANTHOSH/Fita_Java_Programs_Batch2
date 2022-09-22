package com.fita.team2.collections.map;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Shyam", 100);
		map.put("Barani", 200);
		map.put("Peter", 50);
		map.put("Mani", 150);
		System.out.println("Before Modify : " + map.get("Mani"));
		map.put("Mani", 300);
		map.put("Mani", 750);
		
		System.out.println("After Modify : " + map.get("Mani"));
		
		for(Map.Entry<String,Integer> data : map.entrySet()) {
			System.out.println(data.getKey() + "-->" + data.getValue());
		}
		
		for(Map.Entry<String,Integer> data : map.entrySet()) {
			System.out.println(data.getKey() + "-->" + data.getValue());
			if(data.getValue().equals(50)) {
				System.out.println();
				map.put(data.getKey(),null);
			}
			
		}
		System.out.println("Delete Mani :" + map.remove("Mani"));
		
		System.out.println(map.get("Mani"));
		
		for(Map.Entry<String,Integer> data : map.entrySet()) {
			System.out.println(data.getKey() + "-->" + data.getValue());
		}
	}

}
