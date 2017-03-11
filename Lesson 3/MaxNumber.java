package com.gmail.ruslan5665;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int d;
		int max;

		System.out.println("Input a");
		a = sc.nextInt();

		System.out.println("Input b");
		b = sc.nextInt();

		System.out.println("Input c");
		c = sc.nextInt();

		System.out.println("Input d");
		d = sc.nextInt();

		max = a;

		if (b > max) {

			max = b;

		} if (c > max) {

			max = c;

		} if (d > max) {

			max = d;

		} else {

			max = a;
		}

		System.out.println("Maximum number " + max);

	}

}
