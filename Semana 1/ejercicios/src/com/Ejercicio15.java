package com;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantAlu, costArendamiento = 4000;
		System.out.println("Ingrese el número de alumnos que viajaran");
		cantAlu = sc.nextInt();
		sc.close();
		if (cantAlu >= 100) {
			System.out.println("Costo asignado por alumno: $65");
			costArendamiento = cantAlu * 65;
		} else if (cantAlu >= 50 && cantAlu < 100) {
			System.out.println("Costo asignado por alumno: $70");
			costArendamiento = cantAlu * 70;
		} else if (cantAlu >= 30 && cantAlu < 50) {
			System.out.println("Costo asignado por alumno: $95");
			costArendamiento = cantAlu * 95;
		} else if (cantAlu > 0 && cantAlu < 30) {
			System.out.println("Costo asignado por alumno: $" + costArendamiento / cantAlu);
		}
		System.out.println("Costo asignado por la renta $" + costArendamiento);
	}
}
