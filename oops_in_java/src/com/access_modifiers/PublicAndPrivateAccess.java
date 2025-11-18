package com.access_modifiers;

class Student{
	public String std_name =  "mohan";
//	private int age = 20;
	int age = 20;
	protected String cls ="2sem" ;
}


public class PublicAndPrivateAccess {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.std_name);
		System.out.println(s1.age);
	}
}
