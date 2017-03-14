package com.gmail.ruslan5665;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a");
		int a = sc.nextInt();

		System.out.println("Enter b");
		int b = sc.nextInt();

		for (int i = 1; i <= a; i += 1) {

			for (int j = 1; j <= b; j += 1) {

				if (j == 1 || j == b || i == 1 || i == a) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
