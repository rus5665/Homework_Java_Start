package com.gmail.ruslan5665;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// считываем данные с клавиатуры
		Scanner sc = new Scanner(System.in);

		System.out.println("Input 5 numbers and press Enter");

		int number = sc.nextInt();

		// Раскладываем число
		int num1 = number / 10000;

		int num2 = number % 10000 / 1000;

		int num3 = number % 1000 / 100;

		int num4 = number % 100 / 10;

		int num5 = number % 10;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		sc.close();
		
	}

}
