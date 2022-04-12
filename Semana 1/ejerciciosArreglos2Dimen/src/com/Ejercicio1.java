package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arregloEj2 = new int[4][5];
		try {
			for (int i = 0; i < 4; i++) {
				for (int x = 0; x < 5; x++) {
					System.out.println("Ingresar un numero");
					arregloEj2[i][x] = sc.nextInt();
				}
			}

			System.out.println("Matriz llena");
		} catch (Exception ex) {
			System.out.println("No se aceptan letras");
		}

		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 5; x++) {
//
//				System.out.println("En tu cordenadas "+i + ", " + x);
//				System.out.println("El arreglo contine "+arregloEj2[i][x]);
				System.out.print(arregloEj2[i][x] + " ");
			}
			System.out.println();
		}
	}
}
