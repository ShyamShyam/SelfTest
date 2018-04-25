package com.acce.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListSearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		list.add("A");
		list.add("Z");
		list.add("B");
		list.add("N");
		
		System.out.println(list);
		
		Collections.sort(list);
	}

}
