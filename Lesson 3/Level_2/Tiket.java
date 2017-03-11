package com.gmail.ruslan5665;

import java.util.Scanner;

public class Tiket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int d;
		int check1;
		int check2;
		int numberTiket;

		// просим ввести номер билета
		System.out.println("Enter number of ticket");
		numberTiket = sc.nextInt();

		// раскладываем на цифры
		a = numberTiket / 1000;
		b = numberTiket % 1000 / 100;
		c = numberTiket % 100 / 10;
		d = numberTiket % 10;

		check1 = a + b;
		check2 = c + d;

		if (check1 > 9) { // проверяем на двузначные числа

			int a1 = check1 / 10;
			int b1 = check1 % 10;
			check1 = a1 + b1;

		}
		if (check2 > 9) { // проверяем на двузначные числа

			int a2 = check2 / 10;
			int b2 = check2 % 10;
			check2 = a2 + b2;

		}
		if (check1 == check2) {

			System.out.println("This ticket is a happy");

		} else {

			System.out.println("Sorry! This ticket is a unhappy");
		}

	}

}
