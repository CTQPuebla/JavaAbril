package com;

public class Animal {
	
	String nombre;
	String especie;
	double peso;
	String color;
	
	public Animal() {
		
	}

	public Animal(String nombre, String especie, double peso, String color) {
		this.nombre = nombre;
		this.especie = especie;
		this.peso = peso;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	

}
