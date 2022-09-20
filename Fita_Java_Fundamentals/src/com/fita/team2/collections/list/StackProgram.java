package com.fita.team2.collections.list;

import java.util.List;
import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		
		List<String> stack = new Stack<String>();
		Stack<String> stack1 = new Stack<String>();
	
		System.out.println("Stack is empty or not " + stack.isEmpty());
		stack.add("Test");
		stack1.push("Test1");
		stack1.push("Test2");
		System.out.println(stack1.size());
		for(String n:stack1) {
			System.out.println(n);
		}
		System.out.println(stack1.pop());

	}

}
