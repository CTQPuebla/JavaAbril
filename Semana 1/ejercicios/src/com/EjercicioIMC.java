package com;

import java.util.Scanner;

public class EjercicioIMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu peso actual");
		double pA = sc.nextDouble();

		System.out.println("Ingresa tu altura actual");
		double aA = sc.nextDouble();

		double vIMC = pA / Math.pow(aA, 2);

		if (vIMC < 16) {
			System.out.println("Criterio de ingreso en hospital");

		} else if (vIMC < 17) {
			System.out.println("Infrapeso");

		} else if (vIMC < 18) {
			System.out.println("Bajo peso");

		} else if (vIMC < 25) {
			System.out.println("Peso normal(saludable)");

		} else if (vIMC < 30) {
			System.out.println("Sobrepeso (Obesidad de grado 1)");

		} else if (vIMC < 35) {
			System.out.println("Sobrepeso cronico (Obesidad de grado 2)");

		} else if (vIMC < 40) {
			System.out.println("Obesidad premorbida (Obesidad de grado 3)");

		} else {
			System.out.println("Obesidad morbida (Obesidad de grado 4)");
		}
	}
}
