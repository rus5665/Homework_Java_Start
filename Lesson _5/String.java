package com.gmail.ruslan5665;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		java.lang.String s1;

		System.out.println("Input text");
		s1 = sc.nextLine();

		int count = 0;

		char[] t = s1.toCharArray();

		for (int i = 0; i < t.length; i++) {

			if (t[i] == 'b') {

				count = count + 1;

			}

		}

		System.out.println("The text is used " + count + " letters \"B\"");
	}
}
