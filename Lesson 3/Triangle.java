package com.gmail.ruslan5665;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;
		
		// просим ввести стороны треугольника
		System.out.println("Enter side A");
		a = sc.nextDouble();

		System.out.println("Enter side B");
		b = sc.nextDouble();

		System.out.println("Enter side C");
		c = sc.nextDouble();

		// проверяем существует ли такой треугольник
		if (a + b < c || a + c < b || b + c < a) {

			System.out.println("There is no such triangle");

		} else {

			System.out.println("Such a triangle exists");

		}

	}

}
