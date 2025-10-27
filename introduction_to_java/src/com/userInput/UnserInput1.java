package com.userInput;

import java.util.Scanner;

public class UnserInput1 {
	public static void main(String[] args) {
		/*
		 * Scanner - to take input value from user or keyboard
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: "+age);
		sc.close();
	}
}
