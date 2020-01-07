package com.org.java;



public class Swap_Result {
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 200;
		System.out.println("Numbers Before Swap" + num1 + num2);
		
		num1 = (num1 + num2) - num1;
		num2 = (num2 + num1) - num2;
		
		System.out.println("Numbers After Swap"  + num1 + num2);

	}

}
