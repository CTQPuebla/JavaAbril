package com;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer valor");
		int x = sc.nextInt();
		System.out.println("Ingresa el segundo valor");
		int y = sc.nextInt();

		System.out.println("El resultado de la divición de los numeros es " + (x / y));

		if (x == 0) {
			System.out.println("Error fatal *-* ");
		}
		if (y == 0) {
			System.out.println("Error fatal *-* ");
		}
	}
}
