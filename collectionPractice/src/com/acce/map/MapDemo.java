package com.acce.map;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		
		map.put(101, "Shyam");
		map.put(102, "Shubham");
		map.put(103, "Manju");
		
		map.put("Shyam", 100);
		
		map.put("Manju", "BNG");
		
		map.put(200, 200);
		map.put(200, 300);
		
		map.put("300", "Rajesh");
		
		map.put(null, null);
		map.put(null, "NullNull");
		
		System.out.println(map);
		
		map.remove(100);
		map.remove("300");
		
		System.out.println(map.containsKey(100));
		
		System.out.println(map.containsValue(300));
		
		System.out.println(map.get("300"));
		
		map.clear();
		
		
		
		System.out.println(map.size());
	}

}
