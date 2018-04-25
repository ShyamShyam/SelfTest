package com.acce.collection;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet treeSet = new TreeSet(new MyComparator());
		
		treeSet.add(new StringBuffer("S"));
		treeSet.add(new StringBuffer("B"));
		treeSet.add(new StringBuffer("A"));
		treeSet.add(new StringBuffer("Z"));
		treeSet.add(new StringBuffer("K"));
		
		System.out.println(treeSet);
	}

}
