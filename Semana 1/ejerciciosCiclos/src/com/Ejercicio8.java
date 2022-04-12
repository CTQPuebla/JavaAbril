package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x;

		System.out.println("Ingresar el primer número");
		n = sc.nextInt();
		System.out.println("Ingresar el segundo número");
		x = sc.nextInt();
		if (n < x) {
			for (int i = n; i <= x; i++) {
				System.out.println(i);
			}
		}
		else {
			for (int i = x; i <= n; i++) {
				System.out.println(i);
			}
		}
	}
}
