package com.static_final;

class Employee{
	public static String company = "ParvaM";
	
	public static void details() {
		System.out.println("Company: "+company);
	}
}


public class Static1 {
	public static void main(String[] args) {
		System.out.println("Company: "+Employee.company);
		Employee.details();
	}
}
