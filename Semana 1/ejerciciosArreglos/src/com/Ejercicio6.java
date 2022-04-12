package com;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int pos = 0, neg = 0;
		int i;
		double sPos = 0, sNega = 0;
		System.out.println("Lectura de los elementos del array: ");
		for (i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		for (i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				sPos += numeros[i];
				pos++;
			} else if (numeros[i] < 0) {
				sNega += numeros[i];
				neg++;
			}
		}
		if (pos != 0) {
			System.out.println("Media de valor +: " + sPos / pos);
		} else {
			System.out.println("No existe ningún número positivo");
		}
		if (neg != 0) {
			System.out.println("Media de valor -: " + sNega / neg);
		} else {
			System.out.println("No existe ningún número negativo");
		}
	}
}
