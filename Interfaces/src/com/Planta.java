package com;

public class Planta extends SerVivo implements FuncionesBasicas{
	
	double longTallo;
	boolean daFrutos;
	
	
	public Planta() {
		
	}


	public Planta(double longTallo, boolean daFrutos) {
		this.longTallo = longTallo;
		this.daFrutos = daFrutos;
	}


	public double getLongTallo() {
		return longTallo;
	}


	public void setLongTallo(double longTallo) {
		this.longTallo = longTallo;
	}


	public boolean isDaFrutos() {
		return daFrutos;
	}


	public void setDaFrutos(boolean daFrutos) {
		this.daFrutos = daFrutos;
	}


	@Override
	public String toString() {
		return "Planta [longTallo=" + longTallo + ", daFrutos=" + daFrutos + ", nombre=" + nombre + ", color=" + color
				+ ", peso=" + peso + ", tamaño=" + tamaño + "]";
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
