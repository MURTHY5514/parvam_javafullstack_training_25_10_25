package com.polymorphism;

class Calculator{
	void add(int a ,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	void add(double a ,double b) {
		System.out.println("Addition is : "+(a+b));
	}
	void add(double a ,float b) {
		System.out.println("Addition is : "+(a+b));
	}
}


public class Polymorphism1 {
	public static void main(String[] args) {
		//method overloading: declaring same method name but different parameters
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.add(10.45, 20.45f);
		cal.add(10.45, 20.45);

	}
}
