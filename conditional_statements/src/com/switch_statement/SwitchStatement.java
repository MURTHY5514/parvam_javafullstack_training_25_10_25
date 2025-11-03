package com.switch_statement;

public class SwitchStatement {
	public static void main(String[] args) {
		int num = 1;
		
//		switch(num) {
//			case 1:{
//				System.out.println("The number is 1");
//				break;
//			}
//			case 2:{
//				System.out.println("The number is 2");
//				break;
//			}
//			case 3:{
//				System.out.println("The number is 3");
//				break;
//			}
//			default:{
//				System.out.println("Invalid number");
//			}
//		}
		switch(num) {
		case 1->System.out.println("The number is 1");

		case 2->{
			System.out.println("The number is 2");
//			System.out.println();
		}
		case 3->{
			System.out.println("The number is 3");
		}
		default->{
			System.out.println("Invalid number");
		}
	}
	}
}
