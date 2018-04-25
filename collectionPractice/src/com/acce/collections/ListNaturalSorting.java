package com.acce.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListNaturalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		list.add("Z");
		list.add("B");
		list.add("S");
		list.add("N");
		
		//list.add(new Integer(10));
		//list.add(null);
		
		//Before sorting
		System.out.println(list);
		
		//After sorting
		Collections.sort(list);
		System.out.println(list);
	}

}
