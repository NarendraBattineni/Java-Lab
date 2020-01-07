package com.org.java;

import java.util.Scanner;

public class Rate_of_interest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		int P_Amount = sc.nextInt();
		
		System.out.println("Enter the rate of interest :");
		float Interest_Rate = sc.nextFloat();
		
		System.out.println("Enter the time (years) :");
		int years = sc.nextInt();
		
		float Total_interest = (P_Amount * Interest_Rate * years) / 100;
		
		System.out.println("Total interset is :  " + Total_interest);		
		
		sc.close();
	}

}
