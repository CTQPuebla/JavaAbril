package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 12;
		System.out.println("Tabla del " + n);
		for (int i = 1; i <= 12; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
