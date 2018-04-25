package com.acce.collection;

public class Employee implements Comparable {

	String eName;
	int eId;
	
	public Employee(String name, int id) {
		// TODO Auto-generated constructor stub
		this.eName = name;
		this.eId = id;
	}
	
	public String toString(){
		return eName + "-->" + eId;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		int eid1 = this.eId;
		int eid2 = ((Employee)o).eId;
		
		if(eid1 < eid2)
			return -1;
		else if(eid1 > eid2)
			return 1;
		else
			return 0;
	}

}
