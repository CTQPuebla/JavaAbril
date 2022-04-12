package com;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		System.out.println("Ingresar un la tabla de multiplicar que se desea usar");
		n = sc.nextInt();
		System.out.println("Ingresar un la iteración hasta la cual quiera que se repita");
		x = sc.nextInt();
		System.out.println("Tabla del " + n);
		for (int i = 1; i <= x; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}