package com.acce.map;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap map = new TreeMap();
		
		map.put(101, "AAA");
		map.put(102, "BBB");
		map.put(103, "CCC");
		map.put(104, "XYZ");
		map.put(105, null);
		map.put(106, 123456);
		//map.put("ABC", "YYY");
		
		map.put(null, "ZZZ");
		
		System.out.println(map);
	}

}
