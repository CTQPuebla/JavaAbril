package com;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letMayu;
		int x;
		System.out.println("Ingresar la cadena a escanear");
		letMayu = sc.nextLine();

		for (x = 0; x < letMayu.length(); x++) {

			if (Character.isUpperCase(letMayu.charAt(x))) {
				System.out.println("La letra " + letMayu.charAt(x) + " de la cadena escrita está ingresada en mayuscula");

			}

		}

	}
}
