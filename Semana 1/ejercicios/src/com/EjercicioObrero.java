package com;

import java.util.Scanner;

public class EjercicioObrero {
	public static void main(String[] args) {

		double hLabor, hExta, sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar horas trabajadas semanalmente");
		hLabor = sc.nextDouble();
		sc.close();
		if (hLabor < 40) {
			sal = hLabor * 16;
			System.out.println("Su salario semanal es: $" + sal);

		} else if (hLabor > 40) {
			hExta = (hLabor - 40);
			sal = (40 * 16) + (hExta * 20);
			System.out.println("Su salario semanal es: $" + sal);
			System.out.println("El ingreso de sus horas extra trabajadas es: $" + hExta);

		}
	}
}
