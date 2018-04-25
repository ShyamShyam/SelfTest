package com.acce.map;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> tMap = new TreeMap<String, String>();
		
		tMap.put("A", "Apple");
		tMap.put("B", "Ball");
		tMap.put("F", "Fish");
		tMap.put("C", "Cat");
		tMap.put("D", "Dog");
		
		System.out.println(tMap);
		
		System.out.println(tMap.ceilingKey("C"));
		System.out.println(tMap.higherKey("A"));
		System.out.println(tMap.floorKey("C"));
		System.out.println(tMap.lowerKey("B"));
		System.out.println(tMap.pollFirstEntry());
		System.out.println(tMap.pollLastEntry());
		
		System.out.println(tMap);
		
		System.out.println(tMap.descendingMap());
	}

}
