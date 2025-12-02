package com.polymorphism;

class Parent{
	void isWalking() {
		System.out.println("Parent is Walking");
	}
}
class Child extends Parent{
	@Override
	void isWalking() {
		System.out.println("Child is Walking");
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		//method overriding :when a subclass provides a specific implementation of a method that is already defined in its superclass  
		Parent p = new Child();
		p.isWalking();

	}
}
