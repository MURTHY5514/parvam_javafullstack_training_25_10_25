package com.introduction;
public class Array1 {
	public static void main(String[] args) {
		/*
		 * why we need array:
		 * ==================
		 * to over cometh eproblem of n no of variable creation
		 * * for array index start from 0.
		 * syntax:
		 * =======
		 * datatype arr_name[] = new datatype[size];
		 * 
		 * storing:
		 * ========
		 * arr_name[index] = value;
		 * 
		 * 
		 * access:
		 * =======
		 * arr_name[index];
		 * 
		 */
//		String std1 = "Murali";
//		String std2 = "Murali";
//		String std3 = "Murali";
//		String std4 = "Murali";
//		String std5 = "Murali";
		
		String stdudents_name[] =  new String[5];
		stdudents_name[0]="Murali";
		stdudents_name[1]="Mohan";
		stdudents_name[2]="Pavan";
		stdudents_name[3]="Gowtham";
		stdudents_name[4]="Darshan";
		
		System.out.println("First std Name: "+stdudents_name[0]);
		System.out.println("length: "+stdudents_name.length);
		
//		2nd way
		
		int marks[] = {12,23,34,56,67,78};
		System.out.println("Length: "+marks.length);
		
	}
}
