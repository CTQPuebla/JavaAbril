package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer valor");
		int x = sc.nextInt();
		System.out.println("Ingresa el segundo valor");
		int y = sc.nextInt();

		if (x > y) {
			System.out.println("El valor " + x + " es mayor al valor " + y);
		}
		if (y > x) {
			System.out.println("El valor " + y + "es mayor al valor " + x);
		}

		if (y == x) {
			System.out.println("Los valores son iguales");
		}

	}

}
