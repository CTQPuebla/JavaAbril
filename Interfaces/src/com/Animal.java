package com;

public class Animal extends SerVivo implements FuncionesBasicas{
	
	boolean pelaje;
	String extremidades;
	
	public Animal() {
		
	}

	public Animal(boolean pelaje, String extremidades) {
		this.pelaje = pelaje;
		this.extremidades = extremidades;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public String getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(String extremidades) {
		this.extremidades = extremidades;
	}

	@Override
	public String toString() {
		return "Animal [pelaje=" + pelaje + ", extremidades=" + extremidades + ", nombre=" + nombre + ", color=" + color
				+ ", peso=" + peso + ", tamaño=" + tamaño + "]";
	}

	@Override
	public void alimentarse() {
		
		
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducirse() {
		// TODO Auto-generated method stub
		
	}

	
	

}
