package com.dowhile_loop;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		/*
		 * do while loop:
		 * =============
		 * * if you don't the no of iterations
		 * * post condition check loop
		 * 	ini
		 * * this lopp run atleast on time even if condition false
		 * 
		 * ini
		 * do{
		 * 		//body
		 * 	inc/dec
		 * }while(condition);
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();//100
		
		int i = 1;
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=num);
		
		sc.close();
	}
}
