package com;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, noP;
		System.out.println("Ingresar el primer número");
		x = sc.nextInt();
		System.out.println("Ingresar el segundo número");
		y = sc.nextInt();
		sc.close();

		for (int i = x; i <= y; i++) {
			noP = x;
			if ((noP % 2) == 0) {
				System.out.println(x);
			}
			x++;
		}
	}
}