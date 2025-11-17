package com.oops_class_and_object;

import java.util.Scanner;

public class Car {
	//states
	public String car_name = "tata";
	public int no_wheels = 4;
	
	//behaviour
	public void driving() {
		System.out.println(car_name+" car is driving.");
	}
	
	public static void main(String[] args) {
		//object
		// class _name obj_name = new classs_name();
		
		Car car1 = new Car();
		System.out.println(car1);
		System.out.println(car1.car_name);
		System.out.println(car1.no_wheels);
		car1.driving();
	}
}
