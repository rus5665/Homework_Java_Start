package com.gmail.ruslan5665;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double x;
		double y;
		double v;
		double r = 4;

		// просим ввести координаты
		System.out.println("Enter X");
		x = sc.nextDouble();

		System.out.println("Enter Y");
		y = sc.nextDouble();

		/*
		 * вычисляем длину вектора, если он меньше 4, 
		 * то он попадает в круг
		 */

		v = Math.sqrt(x * x + y * y);

		if (v < r) {
			
			System.out.println("V = " + v);
			System.out.println("In");

		}else {
			
			System.out.println("V = " + v);
			System.out.println("Out");
			
		}

	}

}
