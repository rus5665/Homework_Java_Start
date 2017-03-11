package com.gmail.ruslan5665;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double year;

		System.out.println("Enter year");
		year = sc.nextDouble();

		if ( (year % 4 < 1 && year % 100 > 0) || year % 400 == 0) {

			System.out.println("366");

		} else {

			System.out.println("365");
		}

	}

}
