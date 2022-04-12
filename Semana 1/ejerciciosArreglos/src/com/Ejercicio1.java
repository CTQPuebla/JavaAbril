package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = "";
		int temp = 0;
		int sum = 0;
		int cont = 0;
		double media = 0.0;
		String numeros = "";
		System.out.println("Ingresa un numero de 0 a 9 las veces que necesites");
		System.out.println("Para culminar el proceso de ingresar números preciona una letra");
		do {
			System.out.println("Ingresar número");
			c = sc.nextLine();

			if ("1234567890".indexOf(c) >= 0) {

				temp = Integer.parseInt(c);
				sum = sum + temp;
				cont++;
				numeros = numeros + c + ",";
			}
		} while ("1234567890".indexOf(c) >= 0);
		media = sum / cont;
		System.out.println("Media: " + media);
		String[] nums = numeros.split(",");
	}
}
