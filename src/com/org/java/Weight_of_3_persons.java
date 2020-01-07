package com.org.java;

import java.util.Scanner;

public class Weight_of_3_persons {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Weight of 1st Person:");
		float weight_p1 = sc.nextFloat();
		
		System.out.println("Enter Weight of 2nd Person:");
		float weight_p2 = sc.nextFloat();
		
		System.out.println("Enter Weight of 3rd Person:");
		float weight_p3 = sc.nextFloat();
		
		float sum_weight = weight_p1 + weight_p2 + weight_p3;
		
		float avg_weight = sum_weight / 3.0f;
		
		System.out.println("The sum of weight of the 3 persons is : "+ sum_weight + "Kgs" +  "  and the average weight is " + avg_weight + "Kgs");
		
		sc.close();
		
	}
}
