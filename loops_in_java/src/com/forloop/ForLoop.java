package com.forloop;

public class ForLoop {
	public static void main(String[] args) {
		/*
		 * loops:
		 * ======
		 * * to avoid repetative code
		 * 
		 * for(ini;condition;inc/dec){
		 *  //body
			}
			*  when we know the no of iteration 
		 * 
		 */
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}
		}
		for(int i=1;i<=100;i=i+2) {
			System.out.print(i+" ");
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}
		}
	}
}
