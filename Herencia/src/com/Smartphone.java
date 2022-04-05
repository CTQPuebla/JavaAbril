package com;

public class Smartphone extends Celular{
	
	//Atributos extras : planos
	private double gigasAlmacenamiento;
	private boolean sensorHuella;
	private Camara c;
	
	
	public Smartphone() {
		
	}
	
	public Smartphone(String modelo, String marca, String material, int numBotones, double gigasAlmacenamiento,
			boolean sensorHuella, Camara c) {
		super(modelo, marca, material, numBotones);
		this.gigasAlmacenamiento = gigasAlmacenamiento;
		this.sensorHuella = sensorHuella;
		this.c = c;
	}

	public Smartphone(double gigasAlmacenamiento, boolean sensorHuella, Camara c) {
		this.gigasAlmacenamiento = gigasAlmacenamiento;
		this.sensorHuella = sensorHuella;
		this.c = c;
	}


	//Getters & Setters de atributos propios
	public double getGigasAlmacenamiento() {
		return gigasAlmacenamiento;
	}


	public void setGigasAlmacenamiento(double gigasAlmacenamiento) {
		this.gigasAlmacenamiento = gigasAlmacenamiento;
	}


	public boolean isSensorHuella() {
		return sensorHuella;
	}


	public void setSensorHuella(boolean sensorHuella) {
		this.sensorHuella = sensorHuella;
	}


	public Camara getDisplay() {
		return c;
	}


	public void setDisplay(Camara c) {
		this.c = c;
	}
	
	//Comportamiento propio
	public void tomarFoto() {
		c.procesarImagen();		
	}

	@Override
	public String toString() {
		return "Smartphone [gigasAlmacenamiento=" + gigasAlmacenamiento + ", sensorHuella=" + sensorHuella + ", c=" + c
				+ ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca() + ", getMaterial()=" + getMaterial()
				+ ", getNumBotones()=" + getNumBotones() + ", toString()=" + super.toString() + "]";
	}
	

}
