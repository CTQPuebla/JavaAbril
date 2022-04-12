package com;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Ingresar una palabra");
		x = sc.nextLine();
		String[] cadenas = { x };
		for (String cadena : cadenas) {
			if (palin(cadena) == true) {
				System.out.println(cadena + " si es un palindromo");
			} else {
				System.out.println(cadena + " no es un palindromo");
			}

		}
	}

	public static boolean palin(String cadena) {
		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		String invertida = new StringBuilder(cadena).reverse().toString();
		return invertida.equals(cadena);
	}
}
