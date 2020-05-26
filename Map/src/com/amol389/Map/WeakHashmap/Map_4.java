package com.amol389.Map.WeakHashmap;

import java.util.HashMap;

public class Map_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap m = new HashMap();
		
		Temp t = new Temp();
		
		m.put(t, "Amol");
		
		System.out.println(m);
		
		t=null;
		System.gc();
		try {
			Thread.sleep(5000);
			System.out.println(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
 class Temp
 {

	@Override
	public String toString() {
		return "temp";
	}
	 
	public void finalize()
	{
		System.out.println("Finalized Method is called");
	}
 }
