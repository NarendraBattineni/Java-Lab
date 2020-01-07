package com.org.java;

import java.util.Scanner;

public class Sum_of_2_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int num_1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :");
		int num_2 = sc.nextInt();
		
		int sum_1_2 = num_1 + num_2;
		
		
		System.out.println("Sum of  " + num_1 + "  and  " + num_2 + " is " + sum_1_2);		
		
		sc.close();
	}
}
