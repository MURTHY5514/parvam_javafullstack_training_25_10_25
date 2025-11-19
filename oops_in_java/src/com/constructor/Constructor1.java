package com.constructor;

class Student{
	public String name;
	public int roll_no;
	//full args constructot
	Student(String name, int roll_no) {
		this.name=name;
		this.roll_no = roll_no;
	}
	//no args constructor
	Student() {
		
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Roll No: "+this.roll_no);
	}
}

public class Constructor1 {
	public static void main(String[] args) {
		/*
		 * constructor:
		 * ============
		 * * it is sepcial method, the name same as class name, it doesn't 
		 * contain an return type
		 * * used to initialize the instance variables/properties/states.
		 * * by defult jvm will provide the default constructor when you are not craeted any constructor.else not.
		 * * for single class we can define any no of constructor wiht different parameters(constructor overloading)
		 */
		
		Student st = new Student("mohan",20);
		st.display();
		Student st1 = new Student("murali",23);
		st1.display();
	}
}
