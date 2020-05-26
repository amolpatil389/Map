package com.amol389.Map.IdentityHashMap;

import java.util.IdentityHashMap;

public class Map_3_1 {

	public static void main(String[] args) {

		// This is Identity HashMap..Jvm will internally use "==" method for
		// object comparison
		IdentityHashMap<Integer, String> m1 = new IdentityHashMap<Integer, String>();

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		m1.put(i1, "Shree");
		m1.put(i2, "Amol");

		// In this internally JVM uses "==" to compare the key value so 10==10
		// returns False
		// So Output will be {10=Shree, 10=Amol}

		System.out.println(m1);

	}

}
