package com;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, N;
		int estMS = 0, estMI = 0;
		double media = 0;
		do {
			System.out.print("Número de personas: ");
			N = sc.nextInt();
		} while (N <= 0);
		double[] alto = new double[N];
		for (i = 0; i < N; i++) {
			System.out.print("Persona No." + (i + 1) + ": ");
			alto[i] = sc.nextDouble();
			media = media + alto[i];
		}
		media = media / N;
		for (i = 0; i < alto.length; i++) {
			if (alto[i] > media) {
				estMS++;
			} else if (alto[i] < media) {
				estMI++;
			}
		}
		System.out.println("La estatura media es de: " + media + " metros");
		System.out.println("Personas con estatura superior a la media: " + estMS);
		System.out.println("Personas con estatura inferior a la media: " + estMI);
	}
}
