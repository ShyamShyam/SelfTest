package com.acce.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap map = new HashMap();
		
		IdentityHashMap map = new IdentityHashMap();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		map.put(i1, "Shyam");
		map.put(i2, "Sharma");
		
		System.out.println(map);
	}

}
