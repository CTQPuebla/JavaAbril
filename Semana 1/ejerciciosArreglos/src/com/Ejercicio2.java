package com;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		int[] numeros = new int[10];
		double media = 0;
		System.out.println("Ingresa 10 números");
		for (i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ":");
			numeros[i] = sc.nextInt();
		}
		for (i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				media = media + numeros[i];
			}
		}
		System.out.println("Media de valores en posiciones pares \n" + media / 5);
	}
}
