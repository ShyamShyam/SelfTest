package com.acce.map;

public class Temp {

	public String toString(){
		return "Temp";
	}
	
	public void finalize(){
		System.out.println("finalize() method called");
	}
}
