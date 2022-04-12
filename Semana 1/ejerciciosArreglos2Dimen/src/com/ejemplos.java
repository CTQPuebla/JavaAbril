package com;

import java.util.Scanner;

public class ejemplos {
	public static void main(String[] args) {

		// Iicializar arrays (vacios, tamaño)
		int[] arrayD = new int[10];// 1 dimensión
		int[][] arrayDD = new int[5][5];// 2 dimensiones

		// Inicializar un array (llenos, por logica ya se puede saber su tamaño)
		int[] arregloD = { 1, 2, 3, 4, 5, 6 };
		// Arreglo de 3x5
		int[][] arregloDD = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 12, 30 }, { 90, 100, 110, 120, 130 } };

		// Asignarle valor a un array que comenzó vacio
		arrayD[9] = 90;// 1 dimensión

		arrayDD[4][4] = 60;// 2 dimensiones

		int posicion = 0;

		while (posicion < arregloD.length) {
			System.out.println(arregloD[posicion]);
			posicion++;
		}

		// Iterar sobre un arreglo de 2 dimenciones

		for (int i = 0; i < arregloDD.length; i++) {// Itera sobre las filas
			for (int j = 0; j < arregloDD[i].length; j++) {// Iterasobre las columnas
				System.out.println("Fila: " + i + " Columna: " + j + " Valor: " + arregloDD[i][j]);
			}

		}
	}
}
