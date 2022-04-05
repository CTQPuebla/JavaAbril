package com;

public class Producto {
	
	String nombre;
	String presentacion;
	String codigo;
	double precio;
	
	public Producto(String codigo,String nombre, String presentacion, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presentacion = presentacion;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", presentacion=" + presentacion + ", codigo=" + codigo + ", precio="
				+ precio + "]";
	}
	
	
}
