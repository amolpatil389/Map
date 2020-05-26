package com.amol389.Map.Hashmap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		//1--> Insertion order is preserved
		m.put("Shree", 101);
		m.put("Ram", 800);
		m.put("Rahul", 200);
		m.put("Amol", 500);
		System.out.println(m);
		
		
		
	}

}
