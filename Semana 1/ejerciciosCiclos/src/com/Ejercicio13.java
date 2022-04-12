package com;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		double edad;
		double prom = 0;
		double edades = 0;
		int cont = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una edad");
		edad = sc.nextDouble();
		edades += edad;
		prom = edades / cont;
		cont++;
		System.out.println("Promedio de edades: " + prom);
		do {
			System.out.println("Ingresa una edad");
			edad = sc.nextDouble();
			edades += edad;
			prom = edades / cont;
			cont++;
			System.out.println("Promedio de edades: " + prom);
		} while (prom < 25);
		System.out.println("Promedio de edades final " + prom);
		sc.close();

	}
}
