package com.acce.collection;

import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet treeSet = new TreeSet(new MyComparator());
		
		treeSet.add("A");
		treeSet.add("K");
		treeSet.add("B");
		
		treeSet.add(new StringBuffer("ABC"));
		treeSet.add(new StringBuffer("XYZ"));
		treeSet.add("XX");
		treeSet.add("ABC");
		treeSet.add("XYZ");
		treeSet.add("ABCD");
		
		System.out.println(treeSet);
	}

}
