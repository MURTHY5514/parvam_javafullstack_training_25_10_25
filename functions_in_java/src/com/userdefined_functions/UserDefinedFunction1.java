package com.userdefined_functions;

public class UserDefinedFunction1 {
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static void main(String[] args) {
		/*	
		 * function decleration:
		 * =====================
		 * access_modifier return_type fun_name(parameters){
		 * 	//code
		 * }
		 * 
		 * function call:
		 * ==============
		 * fun_name(arguments);
		 * 
		 * * if you want ot declare a function you need to 
		 *   declare outside the main method
		 */
		int res = add(20, 30);
		System.out.println("res: "+res);
	}
}
