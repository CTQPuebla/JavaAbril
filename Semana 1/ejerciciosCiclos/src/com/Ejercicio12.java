package com;

import java.util.Scanner;

public class Ejercicio12 {
	public static class CuadradoAsterisco {

		Scanner teclado = new Scanner(System.in);
		int n, m;

		public void entradato() {
			System.out.println("Ingresar el ancho del cuadrado: ");
			m = teclado.nextInt();
			System.out.println("Ingresar el alto del cuadrado: ");
			n = teclado.nextInt();

			if (n >= 1 && n <= 50) {
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= m; j++) {
						System.out.print(" *");
					}
					System.out.println("");
				}
			} else {
				System.out.println("Favor de ingresar números de entre 1 y 50");
			}
		}

		public static void main(String[] args) {
			CuadradoAsterisco fc = new CuadradoAsterisco();
			fc.entradato();
		}
	}
}
