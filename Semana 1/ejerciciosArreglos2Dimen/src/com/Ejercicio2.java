package com;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura, anchura;

		boolean no1, no2;
		System.out.println("Ingresa el tamaño de tu matriz");
		System.out.print("Ancho: ");
		anchura = sc.nextInt();
		System.out.print("Alto: ");
		altura = sc.nextInt();

		String[][] m1 = new String[altura][anchura];
		String[][] m2 = new String[altura][anchura];
		int[][] res = new int[altura][anchura];
		for (int i = 0; i < altura; i++) {
			for (int x = 0; x < anchura; x++) {
				System.out.print("Matriz 1 posisción " + i + " , " + x + ": ");
				m1[i][x] = sc.next();
			}
		}
		for (int i = 0; i < altura; i++) {
			for (int x = 0; x < anchura; x++) {
				System.out.print("Matriz 2 posiscion " + i + " , " + x + ": ");
				m2[i][x] = sc.next();
			}
		}
		System.out.println("Primera matriz:");
		for (int i = 0; i < altura; i++) {
			for (int x = 0; x < anchura; x++) {
				System.out.print(m1[i][x] + " ");
			}
			System.out.println();
		}
		System.out.println("Segunda matriz:");
		for (int i = 0; i < altura; i++) {
			for (int x = 0; x < anchura; x++) {
				System.out.print(m2[i][x] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < altura; i++) {
			for (int x = 0; x < anchura; x++) {
				System.out.println("Matriz 3 posisción " + i + " , " + x + ": ");
				no1 = test(m1[i][x]);
				System.out.println(no1);
				no2 = test(m2[i][x]);
				System.out.println(no2);
				if (no1 && no2) {
					res[i][x] = Integer.parseInt(m1[i][x]) + Integer.parseInt(m2[i][x]);
				} else {
					res[i][x] = 0;
				}

			}
		}
		System.out.println("Resultado final:");
		for (int i = 0; i < altura; i++) {
			for (int x = 0; x < anchura; x++) {
				System.out.print(res[i][x] + " ");
			}
			System.out.println();
		}

	}

	public static boolean test(String c) {
		boolean seguir;
		seguir = "1234567890".indexOf(Character.toString(c.charAt(0))) >= 0;
		return seguir;
	}

}
