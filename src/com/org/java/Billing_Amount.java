package com.org.java;

import java.util.Scanner;

public class Billing_Amount {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount");
		int Amount = sc.nextInt();
		
		if (Amount > 6000) {
			
			int discount = (int) (Amount * 0.10);
			int net_amount = Amount - discount;
			System.out.println("Your net billing amount is : " + net_amount);
			
		}else {
			System.out.println("Your net billing amount is : " + Amount);
		}
		
		sc.close();
	}
}
