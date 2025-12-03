package com.static_final;

//final class Parent{
//	
//}

class Parent{
	final void  display() {
		System.out.println("Parent class");
	}
	final void  display(int a) {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	@Override
	void  display() {
		System.out.println("Child class");
	}
}


public class Final1 {
	public static void main(String[] args) {
		final double pi;
		pi= 3.14;
		System.out.println("Pi: "+pi);
//		pi=3.45;

	}
}
