package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Principal {
	
	public static void main(String[] args) {
		
//		//Define una lista de objetos del tipo Usuario
//		List<Usuario> users = new ArrayList<Usuario>();
//		
//		Usuario u1 = new Usuario("ANGEL", "EMAIL@SERVER.COM", "PWD1");
//		Usuario u2 = new Usuario("MANUEL", "EMAIL@SERVER.COM", "PWD2");
//		Usuario u3 = new Usuario("ANA", "EMAIL@SERVER.COM", "PWD3");
//		Usuario u4 = new Usuario("LAURA", "EMAIL@SERVER.COM", "PWD4");
//		Usuario u5 = new Usuario("HECTOR", "EMAIL@SERVER.COM", "PWD5");
//		//Ver el tamaño de la lista
//		System.out.println("Tamaño lista: "+users.size());
//		//Agregar elementos a la lista - metodo add
//		users.add(u1);
//		users.add(u2);
//		users.add(u5);
//		users.add(u3);
//		users.add(u4);
//		users.add(u5);
//		users.add(u5);
//		System.out.println("Tamaño lista: "+users.size());
//		//Recuperar un elemento de la lista
//		System.out.println(users.get(0));
//		
//		//Eliminar un elemnto de la lista
//		//users.remove(3);
//		users.remove(u5);
//		System.out.println("Tamaño lista: "+users.size());
//		//Imprime la lista completa
//		System.out.println(users.toString());
//		
//		int x = 0;
//		
//		while(x<users.size()) {
//			
//			System.out.println(users.get(x).getNombre());
//			
//			x++;
//		}
//	
//		
//		HashMap<String, Usuario> hash = new HashMap<String, Usuario>();
//		
//		//agregarle valor al hash
//		hash.put(u1.getNombre(), u1);
//		hash.put(u2.getNombre(), u2);
//		hash.put(u3.getNombre(), u3);
//		hash.put(u4.getNombre(), u4);
//		hash.put(u5.getNombre(), u5);
//		
//		//Pedirle valores al hash
//		System.out.println(hash.get("LAURA"));
//		//Eliminar elemento del hash
//		hash.remove("ANGEL");
//		
//		//Elimina solo si la llave coincide con el valor asociado
//		hash.remove("ANGEL", u4);
//		
//		//Ver el contenido del hash
//		//System.out.println(hash.toString());
//		for(String k : hash.keySet()) {
//			System.out.println(k +":"+ hash.get(k));
//		}
//		//---------------------------------------------------------------------------
//		
//        // Creating a set using the HashSet class
//        Set<Integer> set1 = new HashSet<>();
//
//        // Add elements to the set1
//        set1.add(2);
//        set1.add(3);
//        System.out.println("Set1: " + set1);
//
//        // Creating another set using the HashSet class
//        Set<Integer> set2 = new HashSet<>();
//
//        // Add elements
//        set2.add(1);
//        set2.add(2);
//        System.out.println("Set2: " + set2);
//
//        // Union of two sets
//        set2.addAll(set1);
//        System.out.println("Union is: " + set2);
//        
//        //Define un iterador para poder ver dentro del Set
//        Iterator<Integer> iterate = set1.iterator();
//        
//        while(iterate.hasNext()) {
//            System.out.println(iterate.next());
//        }
		
		
		AgendaContactos ag = new AgendaContactos("Chico", "Azul", 100);
		
		Contacto c1 = new Contacto("Nombre1", "Dir1", "134567890", "email1");
		Contacto c2 = new Contacto("Nombre2", "Dir2", "134567890", "email2");
		Contacto c3 = new Contacto("Nombre3", "Dir3", "134567890", "email3");
		Contacto c4 = new Contacto("Nombre4", "Dir4", "134567890", "email5");
		Contacto c5 = new Contacto("Nombre5", "Dir5", "134567890", "email5");
		Contacto c6 = new Contacto("Nombre6", "Dir6", "134567890", "email6");
		
		
		ag.agregarContacto(c1.getNombre(), c1);
		ag.agregarContacto(c2.getNombre(), c2);
		ag.agregarContacto(c3.getNombre(), c3);
		ag.agregarContacto(c4.getNombre(), c4);
		ag.agregarContacto(c5.getNombre(), c5);
		ag.agregarContacto(c6.getNombre(), c6);

		
		ag.mostrarContactos();


		System.out.println("-----------------------------------");
		//busqueda
		System.out.println(ag.buscarContacto("email5"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
        
        
		
		
		
		
	}

}
