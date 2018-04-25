package com.acce.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		
		map.put(101, "Shyam");
		map.put(102, "Shubham");
		map.put(103, "Manju");
		map.put("Shyam", 100);
		map.put("Manju", "BNG");
		
		System.out.println(map);
		
		System.out.println(map.put("Shyam", 200));
		
		Set set = map.keySet();
		System.out.println(set);
		
		Collection c = map.values();
		System.out.println(c);
		
		Set s = map.entrySet();
		System.out.println(s);
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+"-->"+m.getValue());
			
			if(m.getKey().equals(100))
				m.setValue(500);
			
		}
		System.out.println(map);
		
	}

}
