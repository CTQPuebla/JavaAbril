package com;

import java.util.Scanner;

public class Principal {
	//delaración del método main
	public static void main(String[]args) {
		//Tipos de datos: primitivos (datos planos)
		
		
		
//		boolean bol = false;
//		
//		float f = 12.9f;
//		double d = 23.098;
//		
//		char c = '*'; //solo permite un caracter a la vez
//		int i = 999999999;
//		byte b = 127;
//		short s = 32767;
//		long l = 999999999;
//		
//		
//		
//		//Tipos de datos: objetos
//		//Istanciando objetos de clases wrappers(envoltorios)
//		Boolean bolean = true;
//		
//		//Clase  objeto
//		// 1	  2	 3	4
//		Character ch = 'j';
//		//System.out.println(ch.getNumericValue('f'));
//		Integer ingr = 2098;
//System.out.println(45 + "10");
//		//System.out.println(ingr.toString()+"es un String");
//		//System.out.println(ingr.min(20,13));
//		
//		Float flo = 12f;
//		Byte bte = 127;
//		Short sho = 1;
//		Long lon = (long) 22;
//		Double doub = 23.098;
//		String stri = "Concatenación de los valores ";
		
		
		//System.out.println(flo.floatValue());
		//System.out.println(bte.byteValue());
		//System.out.println(sho.shortValue());
//		//System.out.println(lon.longValue());
//		//System.out.println(doub.doubleValue());
//		System.out.println(stri.toString() + flo.floatValue() + bte.byteValue() + sho.shortValue()+lon.longValue()+doub.doubleValue());
//		
		//-----------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa un valor");
		int yy= sc.nextInt();
//		System.out.println(yy);
		
//		//If - evalua una condicion
//		if (yy>10) {
//			//caso veradero
//			System.out.println("Si es mayor");
//		}else {
//			//no se cumple
//			System.out.println("No es mayor");
//		}
//		
//		//Leer un numero desde teclado e
//		//e imprimir de cuantas cifras es
//		
//		if(yy<00){
//			yy = yy*(-1);
//		}
//		
//		if (yy<10) {
//			
//			System.out.println("el numero es de una cifra");
//		}else if (yy>10 && yy<100){
//			
//			System.out.println("es de 2 cifras");
//		}else if (yy>100 && yy<1000){
//			
//			System.out.println("es de 3 cifras");
//		}else if (yy>1000 && yy<10000){
//			
//			System.out.println("es de 4 cifras");
//		}
//		
		
		//switch
		//Evalua
		
//		int x  = 9;
//		
//		switch(x) {
//		case 1:
//			System.out.println("x vale 1");
//			break;
//		case 2:
//			System.out.println("x vale 2");
//			break;
//		case 3:
//			System.out.println("x vale 3");
//			break;
//		case 4:
//			System.out.println("x vale 4");
//			break;
//			
//			default:
//				System.out.println("Unknown value");
//		}
		
		
		//muestra el el mes del año segun el numero que elijas
		
		

		
		switch(yy) {
		case 1:
			System.out.println("Tu numero equivale a Enero");
			break;
		case 2:
			System.out.println("Tu numero equivale a Febrero");
			break;
		case 3:
			System.out.println("Tu numero equivale a Marzo");
			break;
		case 4:
			System.out.println("Tu numero equivale a Abril");
			break;
		case 5:
			System.out.println("Tu numero equivale a Mayo");
			break;
		case 6:
			System.out.println("Tu numero equivale a Junio");
			break;
		case 7:
			System.out.println("Tu numero equivale a Julio");
			break;
		case 8:
			System.out.println("Tu numero equivale a Agosto");
			break;
		case 9:
			System.out.println("Tu numero equivale a Septiembre");
			break;
		case 10:
			System.out.println("Tu numero equivale a Octubre");
			break;
		case 11:
			System.out.println("Tu numero equivale a Noviembre");
			break;
		case 12:
			System.out.println("Tu numero equivale a Diciembre");
			break;
			
			default:
				System.out.println("El valor no pertenece a ningun  mes");
		}
		
		
		
		
		
		
	}
}
