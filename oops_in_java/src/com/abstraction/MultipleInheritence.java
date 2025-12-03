package com.abstraction;

interface Parent1{
	void parent1();
}
interface Parent2{
	void parent1();
	void parent2();
}
interface Parent3{
	void parent1();
	void parent2();
	void parent3();
}

class Child implements Parent1,Parent2,Parent3{

	@Override
	public void parent2() {
		System.out.println("parent 2");
	}

	@Override
	public void parent1() {
		System.out.println("parent1");
	}

	@Override
	public void parent3() {
		System.out.println("Parent3");
	}
	
}

public class MultipleInheritence {
	public static void main(String[] args) {
		Child c = new Child();
		c.parent1();
		c.parent2();
	}
}
