package com.amol389.Map.IdentityHashMap;

import java.util.HashMap;

public class Map_3 {

	public static void main(String[] args) {
		// This is normal Hash Map..Jvm will use .equal() method for comparison
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		m1.put(i1, "Shree");
		m1.put(i2, "Amol");
		
		// In this internally JVM uses .equal() to compare the key value so 10===10 returns true
		// so output will be [10,"Amol"]
		
		System.out.println(m1);

	}

}
