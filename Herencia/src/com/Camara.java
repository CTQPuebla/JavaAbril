package com;

public class Camara {
	
	double mpx;
	String tipoZoom;
	double distFocal;
	int valorISO;
	
	
	public Camara() {
		
	}

	public Camara(double mpx, String tipoZoom, double distFocal, int valorISO) {
		super();
		this.mpx = mpx;
		this.tipoZoom = tipoZoom;
		this.distFocal = distFocal;
		this.valorISO = valorISO;
	}

	public double getMpx() {
		return mpx;
	}

	public void setMpx(double mpx) {
		this.mpx = mpx;
	}

	public String getTipoZoom() {
		return tipoZoom;
	}

	public void setTipoZoom(String tipoZoom) {
		this.tipoZoom = tipoZoom;
	}

	public double getDistFocal() {
		return distFocal;
	}

	public void setDistFocal(double distFocal) {
		this.distFocal = distFocal;
	}

	public int getValorISO() {
		return valorISO;
	}

	public void setValorISO(int valorISO) {
		this.valorISO = valorISO;
	}

	@Override
	public String toString() {
		return "Camara [mpx=" + mpx + ", tipoZoom=" + tipoZoom + ", distFocal=" + distFocal + ", valorISO=" + valorISO
				+ "]";
	}

	//Comportamiento propio
	
	public String procesarImagen() {		
		return "Esto es una imagen";
	}
	
	
}
