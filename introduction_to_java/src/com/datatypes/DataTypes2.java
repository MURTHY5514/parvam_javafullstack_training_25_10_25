package com.datatypes;

import java.util.Arrays;

public class DataTypes2 {
	public static void main(String[] args) {
		/*
		 * array 
		 * 
		 * datatype[] var_name = {values};
		 */
		int[] arr = {1,2,3,4};
		char[] arr1 = {'a','b','c'};
		System.out.println(arr[3]);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr1);
		
		/*
		 * String
		 * 1. String literal
		 * 2. Using new keyword
		 */
		//1. String literal
		String str1 = "Hunter";
		System.out.println(str1);
		//2. new keyword
		String str2 = new String("Hello World");
		System.out.println(str2);
		
	}
}
