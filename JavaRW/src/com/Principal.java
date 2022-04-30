package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	
	public static void main(String[] args) {
		//Lectura & escritura de archivos
		
		String linea = "";
		
		try {
//			File archivo = new File("C:\\Users\\otro.txt");
//			FileReader fr = new FileReader(archivo);
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			while ((linea = buffer.readLine()) != null) {
//				System.out.println("Linea: " + linea);
//			}
			
			String abc = "abcdefghi";
			File archivo = new File("D:\\hola.txt");
			FileWriter line = new FileWriter(archivo, true);
			
			for (int i = 0; i <abc.length(); i++) {
				
				line.write(abc.charAt(i));
			}
			line.close();
			
		}catch(Exception ex) {
			System.out.println("No encontre el archivo");
		}
		
	}

}
