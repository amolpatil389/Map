package com.amol389.Map.WeakHashmap;

import java.util.WeakHashMap;

public class Map_4_1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//Using Weak Hash
		WeakHashMap m = new WeakHashMap();
		
		Temp_1 t = new Temp_1();
		m.put(t, "Amol");
		t=null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m);
		
		

	}

}
class Temp_1{

	@Override
	public String toString() {
		return "temp";
	}
	
	public void finalize()
	{
		System.out.println("Finalizer Method is called");
	}
	
	
}
