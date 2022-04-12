package com;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el numero");
		int numero = sc.nextInt();
		System.out.println("Ingresa el exponente");
		int exp = sc.nextInt();

		int result = calculaExp(numero, exp);
		if (exp > 0) {
			System.out.println("El resultado es " + result);
		} else if (exp == 0) {
			System.out.println("El resultado es " + result);
		} else if (exp < 0) {
			System.out.println("El resultado es " + result);
		}

	}

	static int calculaExp(int num, int poten) {
		int res = 1;
		if (num > 0 && poten == 0) {
			return res;
		} else if (num == 0 && poten >= 1) {
			return 0;
		} else {
			for (int i = 1; i <= poten; i++) {
				res = res * num;
			}
			return res;
		}
	}
}
