package com;

public class Ejercicio7 {
	public static void main(String[] args) {

		double x, y;
		x = 700;
		System.out.println("Primer inverci�n:\n" + x);
		int i = 0;

		do {
			y = (x * 2) / 100;
			x = x + y;
			i++;
		} while (x <= 1500);
		System.out.println("En " + i + " meses la persona tendra la inversi�n inicial ademas de ganancia ");

	}
}
