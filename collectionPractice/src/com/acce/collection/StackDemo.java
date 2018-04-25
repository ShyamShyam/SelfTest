package com.acce.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		stack.push("A");
		stack.add("B");
		stack.push("C");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("A"));
		System.out.println(stack.search("Z"));
		System.out.println(stack.empty());
	}

}
