package com.entitys;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VENTAS")
public class Ventas {
	
	@Id
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vid_auto")
	@SequenceGenerator(name="vid_auto", sequenceName="VENTAS_SEQ")
	private int ventaId;
	
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	
	@Column(name="FECHA_VENTA", columnDefinition="DATE")
	private Date fechaVenta;
	
	public Ventas() {
		
	}
	
	public Ventas(int id) {
		this.ventaId = id;
	}

	public Ventas(int ventaId, int clienteId, Date fechaVenta) {
		this.ventaId = ventaId;
		this.clienteId = clienteId;
		this.fechaVenta = fechaVenta;
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	@Override
	public String toString() {
		return "Ventas [ventaId=" + ventaId + ", clienteId=" + clienteId + ", fechaVenta=" + fechaVenta + "]";
	}
	
	
	
	

}
