package com.dto;

import java.sql.Date;
import java.util.Calendar;

//DTO - Objeto de solo lectura
public class VentasClienteDTO {
	
	private int ventaId;
	private Date fechaVenta;
	private String nombre;
	
	public VentasClienteDTO() {
		
	}

	public VentasClienteDTO(int ventaId, Date fechaVenta, String nombre) {
		this.ventaId = ventaId;
		this.fechaVenta = fechaVenta;
		this.nombre = nombre;
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "VentasClienteDTO [ventaId=" + ventaId + ", fechaVenta=" + fechaVenta + ", nombre=" + nombre + "]";
	}
	

}
