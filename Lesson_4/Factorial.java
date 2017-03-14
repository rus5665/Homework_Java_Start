package com.gmail.ruslan5665;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 4<n<16");
		
		int a = sc.nextInt();
		
		int factorial = 1;

		if (a < 4 || a > 15) {

			System.out.println("Error");

		} else {

			for (int i = 1; i < (a + 1); i++) {

				factorial = factorial * i;

			}

			System.out.println(factorial);

		}
	}
}
