package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = "";
		int mayores = 0;
		int temp = 0;
		int sum = 0;
		int cont = 0;
		// temp variable temporal para almacenar el numero convertido
		double media = 0.0;
		String numeros = ""; // Almacenará los numeros de manera individual

		do {
			System.out.println("Ingresa un numero");
			c = sc.nextLine();

			if ("1234567890".indexOf(c) >= 0) {

				temp = Integer.parseInt(c); // convierto el numero
				sum = sum + temp; // acumula la suma
				cont++; //
				//
				numeros = numeros + c + ",";
			}
		} while ("1234567890".indexOf(c) >= 0);
		// Calculo de la media
		media = sum / cont;
		System.out.println("Media: " + media);
		// Array de valores numericos recuperado a partir del punto anterior
		String[] nums = numeros.split(",");

		// Comparando 1x1 cada valor para ver si es mayor a la media
		for (int i = 0; i < nums.length; i++) {
			// Imprimo una posicion especifica del array
			System.out.println("Valor actual: " + nums[i]);
			// Comparando si es mayor a la media
			if (Integer.parseInt(nums[i]) > media) {
				mayores++;
			}
		}
		System.out.println("Sumatoia: " + sum);
		System.out.println("Promedio: " + media);
		System.out.println("Mayores a la media: " + mayores);

	}
}
