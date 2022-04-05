package com;

public class CelularBasico extends Celular{
	
	//Atributos extras
	boolean linterna;
	boolean infrarrojo;
	
	
	public CelularBasico(boolean linterna, boolean infrarrojo) {
		this.linterna = linterna;
		this.infrarrojo = infrarrojo;
	}


	public boolean isLinterna() {
		return linterna;
	}


	public void setLinterna(boolean linterna) {
		this.linterna = linterna;
	}


	public boolean isInfrarrojo() {
		return infrarrojo;
	}


	public void setInfrarrojo(boolean infrarrojo) {
		this.infrarrojo = infrarrojo;
	}
	
	//Comportamiento
	public void encenderLinterna() {	
		this.linterna = true;
	}
	
	public void apagarLinterna() {	
		this.linterna = false;
	}
	
	public void transferirArchivosInfrarrojo() {	
		this.infrarrojo = true;
		System.out.println("Transfiriendo ...");
		
	}


	@Override
	public String toString() {
		return "CelularBasico [linterna=" + linterna + ", infrarrojo=" + infrarrojo + ", getModelo()=" + getModelo()
				+ ", getMarca()=" + getMarca() + ", getMaterial()=" + getMaterial() + ", getNumBotones()="
				+ getNumBotones() + "]";
	}


	@Override
	public void reproducirMusica() {
		
		System.out.println("Buscando archivo ...");
		System.out.println("Abriendo ...");
		System.out.println("Reproduciendo ...");
		
	}
	

}
