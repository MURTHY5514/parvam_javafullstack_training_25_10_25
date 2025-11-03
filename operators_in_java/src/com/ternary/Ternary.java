package com.ternary;

public class Ternary {
	public static void main(String[] args) {
		int age = 14;
//		String res = age>18? "yes":"no";
		String res = age>18? age>20? "yes" : "no":"no";
		System.out.println(res);
	}
}
