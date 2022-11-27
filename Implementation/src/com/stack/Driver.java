package com.stack;

public class Driver {
	  public static void main(String[] args) {
	        MyStack<Integer> stack = new MyStack<>(5);
	        try {
	            stack.push(4);
	            stack.push(8);
	            stack.push(3);
	            stack.push(89);
	            stack.pop();
	            stack.push(34);
	            stack.push(45);
	            stack.push(78);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        try {
	            stack.pop();
	            stack.pop();
	            stack.pop();
	            stack.pop();
	            stack.pop();
	            stack.pop();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	
}
