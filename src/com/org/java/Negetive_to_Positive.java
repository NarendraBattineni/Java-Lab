package com.org.java;

import java.util.Scanner;

public class Negetive_to_Positive {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("The number is : " + num);
		}
		else {
			System.out.println("The Number is : " + Math.abs(num));
		}
		
		sc.close();
	}

}
