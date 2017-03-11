package com.gmail.ruslan5665;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int number;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;

		// просим ввести координаты
		System.out.println("Enter X");
		number = sc.nextInt();

		// раскладываем на цифры
		a = number / 100000;
		b = number % 100000 / 10000;
		c = number % 10000 / 1000;
		d = number % 1000 / 100;
		e = number % 100 / 10;
		f = number % 10;
		
		if (a==f && b==e && c==d){ 
			
			System.out.println("This is a palindrome");
			
		}else {
			
			System.out.println("This is not a palindrome");
			
		}
		
		

	}

}
