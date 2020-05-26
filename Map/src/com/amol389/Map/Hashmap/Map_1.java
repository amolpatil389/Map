package com.amol389.Map.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> m = new HashMap();


		
		System.out.println(m);
		
		// 1---->this sout will replace new value and returns old value
		System.out.println(m.put("Shree", 1000));
		
		//2-->Now to get the key set only do the following things
		Set<String> s = m.keySet();
		
		System.out.println(s);
		
		//3--> to get only values 
		Collection<Integer> c = m.values();
		System.out.println(c);
		
		//4--> to get Entry vise object
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		//5--> to change a particular value in Hashmap Using iterator and Entry Interface
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			
			Map.Entry<String, Integer> m1= (Map.Entry<String, Integer>)itr.next();
			System.out.println(m1.getKey()+ " " + m1.getValue());
			
			if(m1.getKey().equals("Amol"))
			{
				m1.setValue(108);
				
			}
		}
		System.out.println(m);

	}

}
