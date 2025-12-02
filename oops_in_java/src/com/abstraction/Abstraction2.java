package com.abstraction;

interface TV1{
	public static final String name="hello";
	String name1="hello";
	public abstract void turnOn();
	void turnOff();
}

class TVRemote1 implements TV1{

	@Override
	public void turnOn() {
		System.out.println("Trunn on");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off");
	}
	
}

public class Abstraction2 {
	public static void main(String[] args) {
		TVRemote1 tv = new TVRemote1();
		tv.turnOff();
		tv.turnOn();
		System.out.println(TV1.name);
	}
}
