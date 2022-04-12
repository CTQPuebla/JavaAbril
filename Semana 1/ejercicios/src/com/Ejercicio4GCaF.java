package com;

import java.util.Scanner;

public class Ejercicio4GCaF {
	public static void main(String[] args) {
		double gradCen, gradFar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar °Centigrados a convertir a °Fahrenheit");
		gradCen = sc.nextFloat();
		sc.close();
		gradFar = 32 + (9 * gradCen / 5);
		System.out.println("Su resultado es " + gradFar + " °Fahrenheit");
	}
}
