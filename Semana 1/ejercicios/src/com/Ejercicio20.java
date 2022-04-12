package com;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		int peso, dest, costo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar el peso del paquete");
		peso = sc.nextInt();
		if (peso <= 5) {
			System.out.println("Ingresar el destino del paquete seg�n su numeraci�n");
			System.out.println("1 Am�rica del norte");
			System.out.println("2 Am�rica central");
			System.out.println("3 Am�rica del sur");
			System.out.println("4 Europa");
			System.out.println("5 Asia");
			dest = sc.nextInt();

			switch (dest) {
			case 1:
				System.out.println("Selecci�n: Am�rica del norte \n" + "Costo por kg: 24 E");
				costo = peso * 24;
				System.out.println("Costo final: " + costo + " E");
				break;
			case 2:
				System.out.println("Selecci�n: Am�rica central \n" + "Costo por kg: 20 E");
				costo = peso * 20;
				System.out.println("Costo final: " + costo + " E");
				break;
			case 3:
				System.out.println("Selecci�n: Am�rica del sur \n" + "Costo por kg: 21 E");
				costo = peso * 21;
				System.out.println("Costo final: " + costo + " E");
				break;
			case 4:
				System.out.println("Selecci�n: Europa \n" + "Costo por kg: 10 E");
				costo = peso * 10;
				System.out.println("Costo final: " + costo + " E");
				break;
			case 5:
				System.out.println("Selecci�n: Asia \n" + "Costo por kg: 18 E");
				costo = peso * 18;
				System.out.println("Costo final: " + costo + " E");
				break;
			default:
				System.out.println("ELIJA UNA ZONA VALIDA");
			}

		} else {
			System.out.println("Los paquetes mayores a 5kg no son transportados por seguridad");
		}
		sc.close();

	}
}
