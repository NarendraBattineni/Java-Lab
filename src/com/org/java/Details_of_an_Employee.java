package com.org.java;

import java.util.Scanner;

public class Details_of_an_Employee {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the empno:");
		int empno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the monthly salary:");
		int Salary = sc.nextInt();
		
		System.out.println("Hi! " + name + " Your employee id is " + empno + " monthly salary is Rs" + Salary +" and yearly salary is Rs" + (Salary*12));
		
		sc.close();
	}
}
