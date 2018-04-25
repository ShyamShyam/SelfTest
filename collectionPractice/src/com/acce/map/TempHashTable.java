package com.acce.map;

public class TempHashTable {

	int i;
	
	TempHashTable(int i){
		this.i = i;
	}
	
	public int hashCode(){
		return i;
	}
	
	public String toString(){
		return i+"";
	}
}
