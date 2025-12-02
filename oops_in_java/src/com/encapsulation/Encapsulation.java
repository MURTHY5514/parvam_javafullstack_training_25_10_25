package com.encapsulation;

class Student{
	private String name;
	private int roll_num;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}

public class Encapsulation {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Murali");
		st1.setRoll_num(123);
		st1.setAge(23);
		System.out.println("Name: "+st1.getName());
		System.out.println("Age: "+st1.getAge());
		System.out.println("Roll No: "+st1.getRoll_num());

	}
}
