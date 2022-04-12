package com;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el un valor");
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("El valor ingresado es par");
		} else {
			System.out.println("El valor ingresado es inpar");
		}

	}
}
