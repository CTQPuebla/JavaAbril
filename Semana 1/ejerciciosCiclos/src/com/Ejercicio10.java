package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		int numero, positivo, inpar;
		Scanner sc = new Scanner(System.in);
		System.out.print("Para finalizar teclea 0 \nIngresa un n�mero: ");
		numero = sc.nextInt();
		positivo = 0;
		inpar = 0;

		while (numero != 0) {
			if (numero > 0) {
				System.out.print("El n�mero es positivo y tambi�n ");
				positivo = positivo + numero;
			} else {
				System.out.println("El n�mero es negativo y tambi�n ");
			}

			if (numero % 2 == 0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
				inpar = inpar + numero;
			}
			System.out.print("Ingresa otro n�mero: ");
			numero = sc.nextInt();
		}
		System.out.println("La sumatoria de los n�meros positivos es: " + positivo);
		System.out.println("La sumatoria de los n�meros impares es: " + inpar);
	}
}
