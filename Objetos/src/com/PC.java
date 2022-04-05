package com;

public class PC {
	
	//Atributos : lo que compone al objeto
	
	String marca, modelo, tama�o, numSerie;
	double precio;
	
	boolean encendido = false;
	
	
	// Metodo Constructor vacio 
	public PC() {
		
	}

	// Constructor con par�metros
	public PC(String marca, String modelo, String tama�o, String numSerie, double precio, boolean encendido) {
		this.marca = marca;
		this.modelo = modelo;
		this.tama�o = tama�o;
		this.numSerie = numSerie;
		this.precio = precio;
		this.encendido = encendido;
	}

	//Getters & Setters
	public String getMarca() {
		return marca;
	}

	//Se le asigna valor al atributo marca
	public void setMarca(String valor) {
		this.marca = valor;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
	//Metodo toString - permite conocer el estado del objeto
	@Override
	public String toString() {
		return "PC [marca=" + marca + ", modelo=" + modelo + ", tama�o=" + tama�o + ", numSerie=" + numSerie
				+ ", precio=" + precio + ", encendido=" + encendido + "]";
	}
	

}
