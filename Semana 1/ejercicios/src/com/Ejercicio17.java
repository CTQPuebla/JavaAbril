package com;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el resultado del dado");
		int x = sc.nextInt();
		switch (x) {
		case 6:
			System.out.println("Uno");
			break;
		case 5:
			System.out.println("Dos");
			break;
		case 4:
			System.out.println("Tres");
			break;
		case 3:
			System.out.println("Cuatro");
			break;
		case 2:
			System.out.println("Cinco");
			break;
		case 1:
			System.out.println("Seis");
			break;
		default:
			System.out.println("ERROR: Número incorrecto");
		}

	}
}
