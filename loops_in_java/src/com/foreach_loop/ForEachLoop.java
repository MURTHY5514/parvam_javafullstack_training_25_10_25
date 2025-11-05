package com.foreach_loop;

public class ForEachLoop {
	public static void main(String[] args) {
		/*
		 * for(int ele:source){
		 * 	//body
		 * }
		 */
		int arr[] = {11,22,34,24,25,56,67,83,91};
		for(int ele :arr) {
//			System.out.print(ele+" ");
			if(ele%2==0) {
				System.out.print(ele+" ");
			}
		}
		
	}
}
