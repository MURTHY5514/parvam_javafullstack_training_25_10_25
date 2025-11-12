package com.recursion_in_java;

public class Recursion {
	
	public static void printNumbers(int n, int step) {
		if(step>n) {
			return;
		}
		System.out.println("number: "+step);
		step++;
		printNumbers(n,step);
	}
	
	public static void main(String[] args) {
		printNumbers(30,12);
	}
}	
