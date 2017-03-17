package com.gmail.ruslan5665;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a;

		// просим ввести размер массива и объявляем его
		System.out.println("Input array size");
		a = sc.nextInt();

		int[] array = new int[a];

		// вводим занчения массива
		for (int i = 0; i < array.length; i++) {

			int b;

			System.out.println("Input value " + i);
			b = sc.nextInt();

			array[i] = b;

		}

		// выводим массив на экран
		System.out.print("Array {");

		for (int i = 0; i < array.length; i++) {

			if (i == (array.length - 1)) {// проверка, чтобы не ставить последнюю запятую

				System.out.print(array[i]);

			} else {

				System.out.print(array[i] + ",");

			}
		}

		System.out.print("}");

	}

}
