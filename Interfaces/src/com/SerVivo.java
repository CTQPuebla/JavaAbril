package com;

public class SerVivo {
	
	String nombre, color;
	double peso;
	String tamaño;
	
	
	public SerVivo() {
		
	}


	public SerVivo(String nombre, String color, double peso, String tamaño) {
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.tamaño = tamaño;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	@Override
	public String toString() {
		return "SerVivo [nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", tamaño=" + tamaño + "]";
	}
	

}
