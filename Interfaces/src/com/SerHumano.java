package com;

public class SerHumano extends SerVivo implements FuncionesBasicas, FuncionesCognitivas{
	
	String idioma;
	String nacionalidad;
	
	
	public SerHumano() {
		
	}


	public SerHumano(String idioma, String nacionalidad) {
		super();
		this.idioma = idioma;
		this.nacionalidad = nacionalidad;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	@Override
	public String toString() {
		return "SerHumano [idioma=" + idioma + ", nacionalidad=" + nacionalidad + ", nombre=" + nombre + ", color="
				+ color + ", peso=" + peso + ", tamaño=" + tamaño + "]";
	}


	@Override
	public void memorizar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void hacerCalculos() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aprender() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		
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
