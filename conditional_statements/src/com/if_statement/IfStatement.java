package com.if_statement;

public class IfStatement {
	/*
	 * 
	 * if(condition){ //true block }
	 * 
	 * 
	 * 
	 * if(condition){ //true block }else{ //false block }
	 * 
	 * 
	 * if(condition){ //true statements } else if (condition){ //true block } else
	 * if (condition){ //true block } else{ //false block }
	 * 
	 * 
	 * switch(var_name){ case 1:{ //code break; } case 2:{ //code break; } case 3:{
	 * //code break; } default:{ //code } }
	 */
	public static void main(String[] args) {
		int num = 10;
		if(num>10) {
			System.out.println("Number is Greater than 10");
		}else {
			System.out.println("Number is not greater than 10");
		}
	}
}
