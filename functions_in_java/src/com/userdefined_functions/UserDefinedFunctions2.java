package com.userdefined_functions;

public class UserDefinedFunctions2 {
	//2
	public static void add(int a , int b) {
		System.out.println("Add: "+(a+b));
	}
	
	public static int sub() {
		int a =40;
		int b=30;
		return a-b;
	}
	
	public static void main(String[] args) {
		/*
		 * 1. the function will accept the parameters and return the value
		 * 2. the function will accept the parameters but not return the value
		 * 3. the function will not accept the parameters and return the value
		 * 4. the function will not  accept the parameters and not return the value
		 */
		
		add(40,50);
		int res = sub();
		System.out.println("Sub: "+res);
	}
}
