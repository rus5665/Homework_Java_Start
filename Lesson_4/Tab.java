package com.gmail.ruslan5665;

import java.util.Scanner;

public class Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int a = sc.nextInt();
		
		for(int i=1;i<(a+1);i++){
			
			System.out.println( i + " x " + a + " = " + (i * a) );
			
		}
		

	}

}
