package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		final String sexo1 = "M";
		final String sexo2 = "F";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa los siguientes datos");
		System.out.println("Teclea tu nota final");
		int x = sc.nextInt();
		System.out.println("Teclea tu edad");
		int y = sc.nextInt();
		System.out.println("Teclea tu sexo M/F");
		String z = sc.next();

		if (x >= 5 && y >= 18 && sexo1.equals(z)) {
			System.out.println("POSIBLE");
		} else if (x >= 5 && y >= 18 && sexo2.equals(z)) {
			System.out.println("ACEPTADA");
		}

		else {
			System.out.println("NO ACEPTADA");
		}

	}
}
