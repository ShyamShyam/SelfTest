package com.acce.map;

import java.util.TreeMap;

import com.acce.collection.MyComparator;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap map = new TreeMap(new MyComparator());
		
		map.put("ABC", 101);
		map.put("XYZ", 102);
		map.put("RST", 103);
		
		
		System.out.println(map);
	}

}
