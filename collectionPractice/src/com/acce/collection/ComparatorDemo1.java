package com.acce.collection;

import java.util.TreeSet;

public class ComparatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet treeSet = new TreeSet(new MyComparator());
		
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(5);
		treeSet.add(0);
		System.out.println(treeSet);
	}

}
