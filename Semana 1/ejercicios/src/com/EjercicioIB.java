package com;

import java.util.Scanner;

public class EjercicioIB {
	public static void main(String[] args) {
		double cantidad, CS, CI, Iver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la cantidad que se dese� donar");
		cantidad = sc.nextDouble();
		sc.close();
		if (cantidad > 10000) {
			System.out.println("Dicho donativo se repatir� conforme a lo posterior:");
			CS = (cantidad * 30) / 100;
			CI = (cantidad * 50) / 100;
			Iver = (cantidad * 20) / 100;
			System.out.println("$" + CS + " equivalente a un 30% ser� dirigida al centro de salud");
			System.out.println("$" + CI + " equivalente a un 50% ser� dirigida al centro de salud");
			System.out.println("$" + Iver + " equivalente a un 20% ser� dirigida a invierciones en la bolsa");
		} else {
			System.out.println("Dicho donativo se repatir� conforme a lo posterior:");
			CS = (cantidad * 25) / 100;
			CI = (cantidad * 60) / 100;
			Iver = (cantidad * 15) / 100;
			System.out.println("$" + CS + " equivalente a un 25% ser� dirigida al centro de salud");
			System.out.println("$" + CI + " equivalente a un 60% ser� dirigida al centro de salud");
			System.out.println("$" + Iver + " equivalente a un 15% ser� dirigida a invierciones en la bolsa");
		}

	}
}
