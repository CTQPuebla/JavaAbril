package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

//		int x = 0;

//	while(x<15){
//		System.out.println("Hola");
//		x++;
//	}
//----------------------------------------------------
//	do {
//		System.out.println("OK");
//	}while(x<15);

//----------------------------------------------------
//		for (int i = 50; i >= 15; i--) {
//			System.out.println("Hda"+i);
//		}

//----------------------------------------------------
		String vocal = "";
		String consonante = "";
		String c = "";

		String m = "29 de mArzo de 2022";
//		System.out.println(m.length());
//		System.out.println(m.charAt());

//		for (int i = 0; i<m.length(); i++) {
//			System.out.println("Hda" + i);
//		}
// ----------------------------------------------------

//mostrar cuantas consonantes y cuantas vocales existen en la cadena por default
		for (int i = 0; i < m.length(); i++) {
			c = Character.toString(m.charAt(i)).toLowerCase();

			if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
				vocal = vocal + c;
			} else if (c.equals("1") || c.equals("2") || c.equals("3") || c.equals("4") || c.equals("5")
					|| c.equals("6") || c.equals("7") || c.equals("8") || c.equals("9") || c.equals("0")
					|| c.equals(" ")) {

			} else {
				consonante = consonante + c;
			}

		}
		System.out.println("Cantidad de Vocales " + vocal.length());
		System.out.println("Cantidad de Consonantes " + consonante.length());
	}
}
