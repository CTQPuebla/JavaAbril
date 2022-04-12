package com;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el día del mes en número");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("Este mes tiene 31 días");
			break;
		case 2:
			System.out.println("Este mes tiene 28 días y 29 dependiendo si es año viciesto");
			break;
		case 3:
			System.out.println("Este mes tiene 31 días");
			break;
		case 4:
			System.out.println("Este mes tiene 30 días");
			break;
		case 5:
			System.out.println("Este mes tiene 31 días");
			break;
		case 6:
			System.out.println("Este mes tiene 30 días");
			break;
		case 7:
			System.out.println("Este mes tiene 31 días");
			break;
		case 8:
			System.out.println("Este mes tiene 31 días");
			break;
		case 9:
			System.out.println("Este mes tiene 30 días");
			break;
		case 10:
			System.out.println("Este mes tiene 31 días");
			break;
		case 11:
			System.out.println("Este mes tiene 30 días");
			break;
		case 12:
			System.out.println("Este mes tiene 31 días");
			break;
		default:
			System.out.println("ERROR");
		}

	}
}
