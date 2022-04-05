package com;

public class Casa {

	protected String color;
	protected int numHabitaciones;
	
	public String ubicacion;
	private int precio;

	public Casa() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public void metodoCasa() {
		System.out.println("Este metodo es nativo de la clase Casa");
	}

	@Override
	public String toString() {
		return "Casa [color=" + color + ", numHabitaciones=" + numHabitaciones + ", ubicacion=" + ubicacion + "]";
	}

}
