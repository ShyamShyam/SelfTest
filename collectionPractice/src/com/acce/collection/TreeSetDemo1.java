package com.acce.collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet treeSet = new TreeSet();
		
		/*treeSet.add(new String("A"));
		//treeSet.add(new StringBuffer("B"));
		//treeSet.add(new StringBuilder("C"));
		treeSet.add(new String("A"));
		treeSet.add(new String("a"));*/
		
		treeSet.add(new Integer(10));
		treeSet.add(new Integer(20));
		
		System.out.println(treeSet);
	}

}
