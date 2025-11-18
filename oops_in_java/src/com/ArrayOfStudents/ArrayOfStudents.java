package com.ArrayOfStudents;

import java.util.Arrays;

class Student{
	public String name;
	public int age;
	public int roll_num;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", roll_num=" + roll_num + "]";
	}	
}

public class ArrayOfStudents {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="pavan";
		s1.age=20;
		s1.roll_num=30;
		Student s2 = new Student();
		s2.name="pavan";
		s2.age=20;
		s2.roll_num=30;
		Student arr[] = new Student [3];
		arr[0]= s1;
		arr[1]= s2;
		System.out.println(Arrays.toString(arr));
	}
}
