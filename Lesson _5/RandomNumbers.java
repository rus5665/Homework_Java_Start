package com.gmail.ruslan5665;

import java.util.Arrays;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[15];

		int[] c = new int[a.length * 2];

		// выводим массив 1 на экран
		System.out.print("Array 1 {");

		for (int i = 0; i < a.length; i++) {

			if (i == (a.length - 1)) {// проверка, чтобы не ставить последнюю запятую

				System.out.print(a[i]);

			} else {

				//заполняем случайными числами от 0 до 50
				a[i] = (int) Math.round(Math.random() * 50);

				System.out.print(a[i] + ",");

			}

		}

		System.out.println("}");
		
		//Заполняем второй массив

		c = Arrays.copyOf(a, 30);

		for (int j = 0; j < a.length; j++) {

			c[(j + a.length)] = a[j] * 2;

		}

		// выводим массив 2 на экран
		System.out.print("Array 2 {");

		for (int l = 0; l < c.length; l++) {

			if (l == (c.length - 1)) {// проверка, чтобы не ставить последнюю запятую

				System.out.print(c[l]);

			} else {

				System.out.print(c[l] + ",");
				
			}
			
		}

		System.out.println("}");

	}

}
