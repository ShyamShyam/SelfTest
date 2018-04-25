package com.acce.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hashSet = new HashSet();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add(null);
		System.out.println(hashSet.add(null));
		hashSet.add(10);
		
		System.out.println(hashSet);
		
	}

}
