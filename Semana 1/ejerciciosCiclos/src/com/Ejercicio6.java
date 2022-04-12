package com;

public class Ejercicio6 {
	public static void main(String[] args) {

		double x, y;
		x = 1000;
		System.out.println("Primer inverción:\n" + x);

		for (int i = 1; i <= 12; i++) {

			if (i == 12) {
				y = (x * 2) / 100;
				x = x + y;
				System.out.println("Cantidad del dinero al final del año:\n" + x);
			} else {
				y = (x * 2) / 100;
				x = x + y;
			}
		}
	}
}
