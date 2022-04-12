package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		int numero, positivo, inpar;
		Scanner sc = new Scanner(System.in);
		System.out.print("Para finalizar teclea 0 \nIngresa un número: ");
		numero = sc.nextInt();
		positivo = 0;
		inpar = 0;

		while (numero != 0) {
			if (numero > 0) {
				System.out.print("El número es positivo y también ");
				positivo = positivo + numero;
			} else {
				System.out.println("El número es negativo y también ");
			}

			if (numero % 2 == 0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
				inpar = inpar + numero;
			}
			System.out.print("Ingresa otro número: ");
			numero = sc.nextInt();
		}
		System.out.println("La sumatoria de los números positivos es: " + positivo);
		System.out.println("La sumatoria de los números impares es: " + inpar);
	}
}
