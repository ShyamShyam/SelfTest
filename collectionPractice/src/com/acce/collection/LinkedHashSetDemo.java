package com.acce.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		System.out.println(linkedHashSet.add("A"));
		linkedHashSet.add(null);
		linkedHashSet.add(10);
		System.out.println(linkedHashSet);
	}

}
