package com.acce.map;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable table = new Hashtable(25);
		
		table.put(new TempHashTable(5), "AAA");
		table.put(new TempHashTable(2), "BBB");
		table.put(new TempHashTable(15), "CCC");
		table.put(new TempHashTable(6), "DDD");
		table.put(new TempHashTable(23), "EEE");
		//table.put(null, "BBB");
		
		
		
		System.out.println(table);
	}

}
