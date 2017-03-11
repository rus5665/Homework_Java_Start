package com.gmail.ruslan5665;

import java.util.Scanner;

public class Floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int appart;
		int floor;
		int entrance;

		System.out.println("Input apartment number");
		appart = sc.nextInt();

		// проверяем есть ли квартира в доме, если нет, то просим ввести еще раз
		while (appart < 0 || appart > 144) {

			System.out.println("In this house there is no such apartment");
			System.out.println("Try again");
			appart = sc.nextInt();
		}

		// вычисляем подъезд и этаж
		if (appart % 36 == 0) { // для последней квартиры в подъезде

			entrance = appart / 36;
			floor = 9;

		} else if (appart % 36 % 4 == 0) { // для последней квартиры на этаже

			entrance = appart / 36 + 1;
			floor = appart % 36 / 4;

		} else { // для остальных

			entrance = appart / 36 + 1;
			floor = appart % 36 / 4 + 1;

		}

		System.out.println("Apartment " + appart + " Floor " + floor + " Etrance " + entrance);

	}

}
