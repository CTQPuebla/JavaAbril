package com;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int canAlu, i;
		double suma = 0, media;

		do {
			System.out.print("Cantidad de alumnos de la clase: ");
			canAlu = sc.nextInt();
		} while (canAlu <= 0);

		double[] notas = new double[canAlu];
		for (i = 0; i < notas.length; i++) {
			System.out.print("Nota final del alumno " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}
		for (i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		media = suma / notas.length;
		System.out.println("La nota media del curso es: "+media);
		System.out.println("--------------------------------");
		for (i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				System.out.println("El alumno " + (i + 1) + " con nota final de " + notas[i]+"\n está dentro del rango de superiores a la media");
			}
		}
	}
}
