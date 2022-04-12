package com;

import java.util.Scanner;
import java.io.IOException;

public class Ejercicio4 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String texto;
		char caracter;
		int noVeces = 0;
		do {
			System.out.println("Introduce una cadena de texto: ");
			texto = sc.nextLine();
		} while (texto.isEmpty());
		System.out.print("Introduce un carácter: ");
		caracter = (char) System.in.read();
		noVeces = contarCaracteres(texto, caracter);
		if (noVeces > 0) {
			System.out.println("El caracter " + caracter + " aparece " + noVeces + " veces");
		} else {
			System.out.println("Carácter no encontrado");
		}

	}

	public static int contarCaracteres(String cadena, char caracter) {
		int posicion, contador = 0;
		posicion = cadena.indexOf(caracter);
		while (posicion != -1) {
			contador++;
			posicion = cadena.indexOf(caracter, posicion + 1);
		}
		return contador;
	}
}
