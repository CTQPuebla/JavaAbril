package com;

import java.util.HashMap;

public class AgendaContactos {

	private String tama�o, color;
	private int numPaginas;

	HashMap<String, Contacto> hash = new HashMap<String, Contacto>();

	// Referencia comodin
	Contacto c = null;

	public AgendaContactos() {

	}

	public AgendaContactos(String tama�o, String color, int numPaginas) {
		this.tama�o = tama�o;
		this.color = color;
		this.numPaginas = numPaginas;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "AgendaContactos [tama�o=" + tama�o + ", color=" + color + ", numPaginas=" + numPaginas + "]";
	}

	public void agregarContacto(String nombre, Contacto c) {
		this.hash.put(nombre, c);
	}

	public Contacto buscarContacto(String email) {
		// Recorrer el hash buscando un valor en cada objeto
		for (String s : this.hash.keySet()) {
			// Busco el email en cada objeto Contacto
			if (hash.get(s).getEmail().equals(email)) {
				c = hash.get(s);
				break;
			}
		}
		return c;
	}

	public void eliminarContacto(String nombre) {
		this.hash.remove(nombre);
		System.out.println("Se ha eliminado el contacto");
	}

	public void actualizarContacto(String nombre, Contacto c) {

		this.hash.put(nombre, c);
		System.out.println("Actualizado");
	}

	public void mostrarContactos() {

		for (String s : this.hash.keySet()) {
			System.out.println(hash.get(s));
		}
	}

}
