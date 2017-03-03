package com.gmail.ruslan5665;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// считываем данные с клавиатуры
		Scanner sc = new Scanner(System.in);

		System.out.println("Input radius and press Enter");

		double radius = sc.nextDouble();

		// вычисляем длину окружности
		double circumference = 2 * Math.PI * radius;

		char pi = (char) 960;

		System.out.println("Circumference = 2" + pi + "*R = " + circumference);

		sc.close();

	}

}
