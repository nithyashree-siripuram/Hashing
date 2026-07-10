package com.hash;

import java.util.HashMap;
import java.util.Map;

public class Hashset {

	public static void main(String[] args) {
		//creating
		HashMap<String,Integer> map=new HashMap<>();
		
		//Insertion
		map.put("India",140);
		map.put("China",150);
		map.put("USA",25);
		
		//re-inserting
		map.put("USA",110);
		
		//searching
		if(map.containsKey("China")){
			System.out.println("Key is present in the map");
		}
		else{
			System.out.println("Key is not present in the map");
		}
		System.out.println(map.get("China"));
		System.out.println(map.get("Indonesia"));

		//printing
		System.out.println(map);
		//Iteration
		for(Map.Entry<String,Integer> e : map.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//size
		System.out.println("SIZE ="+map.size());

	}

}
