package com.gmail.ruslan5665;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0.3;
		double b = 0.4;
		double c = 0.5;
		
		double p = 0.5*(a+b+c);
		
		System.out.println("S = "+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}

}
