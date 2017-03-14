package com.gmail.ruslan5665;

import java.util.Scanner;

public class Wallpapers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int a = sc.nextInt();

		for (int i = 1; i <= a; i += 1) {

			for (int j = 1; j <= a; j += 1) {

				if (j % 2 == 0) {
					System.out.print("***");
				} else {

					System.out.print("+++");
				}

			}
			System.out.println();

		}

	}

}
