package com.abstraction;

abstract class TV{
	abstract void turnOn();
	abstract void turnOff();
}
class TVRemote extends TV{

	@Override
	void turnOn() {
		System.out.println("TV is Turing on");
	}

	@Override
	void turnOff() {
		System.out.println("TV is Turning OFF");
	}
	
}

public class Abstraction1 {
	public static void main(String[] args) {
		TVRemote tr = new TVRemote();
		tr.turnOff();
		tr.turnOn();
//		TV tv = new TV(); // for abstarct class we can't create a object
	}
}
