package com;

import java.util.Scanner;

public class EjercicioMensajeOculto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char tipoC;
		int i;
		String mDistor;
		System.out.println("Ingresar el mensaje");
		mDistor = sc.nextLine();
		char[] smsCad = new char[mDistor.length()];
		mDistor.toLowerCase();
		sc.close();
		for (i = 0; i < mDistor.length(); i++) {
			tipoC = mDistor.charAt(i);
			if (tipoC == ' ') {
				tipoC = ' ';
			} else {
				if (tipoC == 'Z') {
					tipoC = 'A';
				} else {
					if (tipoC == 'z') {
						tipoC = 'a';
					} else {
						tipoC++;
					}
				}
			}
			smsCad[i] = tipoC;
		}
		String smsD = new String(smsCad);
		System.out.println("Mensaje distorcionado con exito \n" + smsD);
	}
}
