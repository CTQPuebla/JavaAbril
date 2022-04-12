package com;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cent = 0;
		double uvasCA1;
		double uvasCA2;
		double uvasCB1;
		double uvasCB2;

		System.out.println("Ingresar cantidad de uvas clase A tipo 1");
		uvasCA1 = sc.nextDouble();
		System.out.println("Ingresar cantidad de uvas clase A tipo 2");
		uvasCA2 = sc.nextDouble();
		System.out.println("Ingresar cantidad de uvas clase B tipo 1");
		uvasCB1 = sc.nextDouble();
		System.out.println("Ingresar cantidad de uvas clase B tipo 2");
		uvasCB2 = sc.nextDouble();
		sc.close();
		if (uvasCA1 <= 0 || uvasCA2 <= 0 || uvasCB1 <= 0 || uvasCB2 <= 0) {
			System.out.println("Cantidad invalida");

		}
		if (uvasCA1 > 0) {
			System.out.println("Ingresos obtenidos con la Clase de uvas A Tipo 1" + uvasCA1 * 20);
		}
		if (uvasCA2 > 0) {
			System.out.println("Ingresos obtenidos con la Clase de uvas A Tipo 2" + uvasCA2 * 30);
		}
		if (uvasCB1 > 0) {
			System.out.println("Ingresos descontados con la Clase de uvas B Tipo 1" + uvasCB1 * 30);
		}
		if (uvasCB2 > 0) {
			System.out.println("Ingresos descontados con la Clase de uvas B Tipo 2" + uvasCB1 * 50);

		}
		cent += (uvasCA1 * 20);
		cent += (uvasCA2 * 30);
		cent -= (uvasCB1 * 30);
		cent -= (uvasCB2 * 50);
		System.out.println("El total obtenido de ingresos o egresos de la uva sin importar la clase o tipo es:" + cent);

	}
}
