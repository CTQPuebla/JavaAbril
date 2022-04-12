package com;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, cont = 2;

		int[] pares = new int[20];
		for (i = 0; i < pares.length; i++) {
			pares[i] = cont;
			cont += 2;
		}
		for (i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
	}
}
