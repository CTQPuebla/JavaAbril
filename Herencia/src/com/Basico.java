package com;

public class Basico extends Celular{
	
	
	boolean infrarrojo;
	boolean linterna;
	boolean radio;
	
	public Basico() {
		
	}

	public Basico(String marca, String color, String materiales, double mAh, int botones, String almacenamiento,
			Pantalla pantalla, boolean infrarrojo, boolean linterna, boolean radio) {
		super(marca, color, materiales, mAh, botones, almacenamiento, pantalla);
		this.infrarrojo = infrarrojo;
		this.linterna = linterna;
		this.radio = radio;
	}

	public boolean isInfrarrojo() {
		return infrarrojo;
	}

	public void setInfrarrojo(boolean infrarrojo) {
		this.infrarrojo = infrarrojo;
	}

	public boolean isLinterna() {
		return linterna;
	}

	public void setLinterna(boolean linterna) {
		this.linterna = linterna;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Basico [infrarrojo=" + infrarrojo + ", linterna=" + linterna + ", radio=" + radio + ", marca=" + marca
				+ ", color=" + color + ", materiales=" + materiales + ", mAh=" + mAh + ", botones=" + botones
				+ ", almacenamiento=" + almacenamiento + ", pantalla=" + pantalla + ", encendido=" + encendido + "]";
	}


	

}
