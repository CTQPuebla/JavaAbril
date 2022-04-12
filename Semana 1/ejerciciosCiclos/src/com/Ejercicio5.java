package com;

public class Ejercicio5 {
	public static void main(String[] args) {

		String h;
		String min;
		String seg;

		for (int i = 0; i < 24; i++) {
			for (int x = 0; x < 60; x++) {
				for (int y = 0; y < 60; y++) {

					if (i < 10) {
						h = "0" + Integer.toString(i);
					} else {
						h = Integer.toString(i);
					}
					if (x < 10) {
						min = "0" + Integer.toString(x);
					} else {
						min = Integer.toString(x);
					}
					if (y < 10) {
						seg = "0" + Integer.toString(y);
					} else {
						seg = Integer.toString(y);
					}
					System.out.println(h + ":" + min + ":" + seg);
				}

			}

		}

	}
}
