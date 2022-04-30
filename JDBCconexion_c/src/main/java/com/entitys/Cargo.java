package com.entitys;

public class Cargo {
	
	private int cargoId;
	private String descripcion;
	private double sueldo;
	
	public Cargo() {
		
	}

	public Cargo(int cargoId, String descripcion, double sueldo) {
		this.cargoId = cargoId;
		this.descripcion = descripcion;
		this.sueldo = sueldo;
	}

	public int getCargoId() {
		return cargoId;
	}

	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Cargo [cargoId=" + cargoId + ", descripcion=" + descripcion + ", sueldo=" + sueldo + "]";
	}
	
}
