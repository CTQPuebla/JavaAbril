package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		

		Scanner scan = null;
		int flag;
		HashMap<String, Contacto> agenda = new HashMap<String, Contacto>();
		List<Contacto> resultados = new ArrayList<Contacto>();
		
		Implementacion imp = new Implementacion();
		
		String nombre, telefono, direccion, correo, pais;
		
		
		do {
			System.out.println("Agenda");
			System.out.println("1. Agregar un contacto");
			System.out.println("2. Editar datos de un contacto");
			System.out.println("3. Buscar un contacto por nombre");
			System.out.println("4. Eliminar un contacto");
			System.out.println("5. Buscar contactos por pais");
			System.out.println("6. Mostrar una lista de los contactos");
			System.out.println("7. Salir");
			System.out.println("Selecciona una opcion:");
			scan = new Scanner(System.in);
			flag = scan.nextInt();

			switch (flag) {
			//Nuevo - seminuevo

			case 1:
				//agregar
				System.out.println("Ingresa el nombre:");
				scan = new Scanner(System.in);				
				nombre = scan.nextLine();
				
				System.out.println("Ingresa el telefono:");
				scan = new Scanner(System.in);				
				telefono = scan.nextLine();
				
				System.out.println("Ingresa la direccion:");
				scan = new Scanner(System.in);				
				direccion = scan.nextLine();
				
				System.out.println("Ingresa el correo:");
				scan = new Scanner(System.in);				
				correo = scan.nextLine();
				
				System.out.println("Ingresa el pais:");
				scan = new Scanner(System.in);				
				pais = scan.nextLine();
				
				//creacion del objeto
				Contacto contacto = new Contacto(nombre, telefono, direccion, correo, pais);
				imp.agregar(contacto);
				agenda.put(contacto.getNombre(), contacto);
				
				break;
			case 2:
				//Primero tengo que buscar aquello que quiero manipular
				System.out.println("Ingresa el nombre del contacto a editar:");
				scan = new Scanner(System.in);				
				nombre = scan.nextLine();
				
				//Recorrer la lista para encontrar el objeto deseado
				for(String key:agenda.keySet()) {
					
					//Si el modelo del auto actual coincide con el parametro buscado
					if(agenda.get(key).getNombre().equals(nombre)) {
						//Pido los nuevos datos de los atributos del auto
						System.out.println("Ingresa el telefono:");
						scan = new Scanner(System.in);				
						telefono = scan.nextLine();
						
						System.out.println("Ingresa el pais:");
						scan = new Scanner(System.in);				
						pais = scan.nextLine();
						
						//Actualizacion de los datos
						agenda.get(key).setTelefono(telefono);
						agenda.get(key).setPais(pais);															
					}
					
				}
				break;
			case 3:
				
				System.out.println("Ingresa el nombre del contacto:");
				scan = new Scanner(System.in);				
				nombre = scan.nextLine();
				
				//Recorrer la lista para encontrar el objeto deseado
				for(String key:agenda.keySet()) {
					
					//Si nombre del contacto coincide con el buscado
					//Revisar el tema de la llave
					if(agenda.get(key).getNombre().equals(nombre)) {
						//Imprimo los datos del contacto
						System.out.println(agenda.get(key));
																				
					}
					
				}

				break;
			case 4:
				System.out.println("Ingresa el nombre del contacto:");
				scan = new Scanner(System.in);				
				nombre = scan.nextLine();
				
				
				agenda.remove(nombre);
				
				
				break;
			case 5:
				System.out.println("Ingresa el pais deseada:");
				scan = new Scanner(System.in);				
				pais = scan.nextLine();
				
				//Recorre la lista de contactos
				for(String key:agenda.keySet()) {
					//Comprueba si el contacto actual coincide con el pais
					if(agenda.get(key).getPais().equals(pais)) {
						//Agrego el elemento actual a la lista de resultados
						resultados.add(agenda.get(key));
					}
				}
				
				//Muestra los autos de la marca buscada
				System.out.println(resultados.toString());
				resultados.clear();
				
				resultados = imp.buscarPorPais(pais);
				
				break;
			case 6:
				//Imprime todo lo que hay en la lista
				System.out.println(agenda.toString());				
				break;

			}

		} while (flag != 7);
		
		
		
	}

}
