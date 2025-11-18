package com.inheritence;

class Parent{
	public boolean isWalking = true;
	
	public void isWorking() {
		System.out.println("Parent can work");
	}
}

class Child extends Parent{
	
}

//multiple inheritence
//class Parent1{
//	
//}
//class Parent2{
//
//}
//
//class Child1 implements Parent1, Parent2{
//	
//}
public class Inheritence_inJava {
	public static void main(String[] args) {
		/*
		 * Inheritence:
		 * ===========
		 * * extending the properties of parent to child
		 * * we use extends keyword
		 * types:
		 * ======
		 * * 1. single  level inhritence
		 * 2. multi level 
		 * 3. heirarchical
		 * 4. hybrid
		 * 
		 * * in java using classes we can't achiev multiple inheritence
		 *   (we shoud go for interface)
		 */
		Child c1 = new Child();
		c1.isWorking();
		System.out.println(c1.isWalking);
		
	}
}
