package com;

import java.util.Scanner;

public class Ejercicio8Radio {
	public static void main(String[] args) {
		double vol, rad, pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar el radio de la esfera");
		rad = sc.nextDouble();
		sc.close();
		vol = (pi * 4 / 3) * Math.pow(rad, 3.0);
		System.out.println("La esfera tiene como volumen total:\n " + vol + " y un radio de radio " + rad);
	}
}
