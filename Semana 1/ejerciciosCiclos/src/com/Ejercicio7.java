package com;

public class Ejercicio7 {
	public static void main(String[] args) {

		double x, y;
		x = 700;
		System.out.println("Primer inverción:\n" + x);
		int i = 0;

		do {
			y = (x * 2) / 100;
			x = x + y;
			i++;
		} while (x <= 1500);
		System.out.println("En " + i + " meses la persona tendra la inversión inicial ademas de ganancia ");

	}
}
