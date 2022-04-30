package com;

public class Pantalla {
	
	String resolucion;
	String dimensiones;
	String tipo;
	boolean tactil;
	
	
	public Pantalla(String resolucion, String dimensiones, String tipo, boolean tactil) {
		this.resolucion = resolucion;
		this.dimensiones = dimensiones;
		this.tipo = tipo;
		this.tactil = tactil;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	public String getDimensiones() {
		return dimensiones;
	}


	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", dimensiones=" + dimensiones + ", tipo=" + tipo + "]";
	}
	
	
}
