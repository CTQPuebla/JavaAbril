package com;

public class SerVivo {
	
	String nombre, color;
	double peso;
	String tama�o;
	
	
	public SerVivo() {
		
	}


	public SerVivo(String nombre, String color, double peso, String tama�o) {
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.tama�o = tama�o;
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


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}


	@Override
	public String toString() {
		return "SerVivo [nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", tama�o=" + tama�o + "]";
	}
	

}
