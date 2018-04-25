package com.acce.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		WeakHashMap map = new WeakHashMap();
		
		//HashMap map = new HashMap();
		
		Temp temp = new Temp();
		
		map.put(temp, "Shyam");
		
		System.out.println(map);
		
		temp = null;
		
		System.gc();
		
		Thread.sleep(1000);
		
		System.out.println(map);
	}

}
