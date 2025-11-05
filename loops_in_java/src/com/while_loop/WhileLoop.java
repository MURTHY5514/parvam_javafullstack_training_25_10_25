package com.while_loop;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 * while loop:
		 * ===========
		 * * if you don't the no of iterations
		 * * pre condition check loop
		 * 	ini
		 * while(condition){
		 * 	
		 * 		//body
		 * 	inc/dec
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();//100
		
		int i = 1;
		while(i<=num) {
			System.out.print(i+" ");
			i++;
		}
		
		sc.close();
	}
}
