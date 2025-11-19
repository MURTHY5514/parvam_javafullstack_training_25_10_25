package com.this_super;

class Person{
	public String name;
	public int age = 60;
}

class Employee extends Person{
	public String empId;
	public int age = 30;
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Emp Id: "+this.empId);
		System.out.println("Emp Age: "+this.age);
		System.out.println("Emp Parent Age: "+super.age);
	}
}

public class ThisSuper {
	public static void main(String[] args) {
		/*
		 * this -> it will point to the current object (we can access
		 * current object properties, method / action, constructor)
		 * super -> using super we can call immediate parent object(we can access
		 * parent object properties, method / action, constructor)
		 */
		Employee emp1 = new Employee();
		emp1.name="mohan";
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.name="mohan123";
		emp2.display();
	}
}
