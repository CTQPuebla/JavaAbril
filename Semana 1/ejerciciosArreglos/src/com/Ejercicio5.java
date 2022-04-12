package com;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int p = 0, n = 0, c = 0;
		int i;

		for (i = 0; i < nums.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
		}
		for (i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				p++;
			} else if (nums[i] < 0) {
				n++;
			} else {
				c++;
			}
		}
		System.out.println("Cantidad de números positivos: " + p);
		System.out.println("Cantidad de números negativos: " + n);
		System.out.println("Cantidad de números cero: " + c);
	}
}
