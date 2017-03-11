package com.gmail.ruslan5665;

import java.util.Scanner;

public class TriangleCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Задаем координаты треугольника
		double x1 = 0;
		double x2 = 0;
		double y1 = 4;
		double y2 = 4;
		double z1 = 6;
		double z2 = 1;
		// координаты точки
		double a1;
		double a2;

		// просим ввести координаты
		System.out.println("Enter X");
		a1 = sc.nextDouble();

		System.out.println("Enter Y");
		a2 = sc.nextDouble();

		/*
		 * Разбиваем точкой треугольник на три треугольника Если сумма площадей
		 * получившихся треугольников равна площади заданного треугольника
		 * значит точка внутри Площади считаем по формуле Герона
		 */

		// площадь заданного треугольника
		double xy = Math.sqrt((x1 - y1) * (x1 - y1) + (x2 - y2) * (x2 - y2));
		double xz = Math.sqrt((x1 - z1) * (x1 - z1) + (x2 - z2) * (x2 - z2));
		double yz = Math.sqrt((z1 - y1) * (z1 - y1) + (z2 - y2) * (z2 - y2));

		double p = (xy + xz + yz) * 0.5; // полупериметр

		double s = Math.sqrt((p - xy) * (p - xz) * (p - yz) * p); // площадь

		// площадь получившегося треугльника s1

		double ay = Math.sqrt((a1 - y1) * (a1 - y1) + (a2 - y2) * (a2 - y2));
		double az = Math.sqrt((a1 - z1) * (a1 - z1) + (a2 - z2) * (a2 - z2));

		double p1 = (ay + az + yz) * 0.5;

		double s1 = Math.sqrt((p1 - ay) * (p1 - az) * (p1 - yz) * p1);
		
		// площадь получившегося треугльника s2

		double ax = Math.sqrt((a1 - x1) * (a1 - x1) + (a2 - x2) * (a2 - x2));

		double p2 = (ay + ax + xy) * 0.5;

		double s2 = Math.sqrt((p2 - ay) * (p2 - ax) * (p2 - xy) * p2);
		// площадь получившегося треугльника s3

		double p3 = (ax + az + xz) * 0.5;

		double s3 = Math.sqrt((p3 - ax) * (p3 - az) * (p3 - xz) * p3);

		

		// сравниваем площади
		if ( (s-(s1 + s2 + s3)) < 0.00001 && (s-(s1 + s2 + s3)) > 0.0) {

			System.out.println("In");

		} else {

			System.out.println("Out");

		}

	}
}
