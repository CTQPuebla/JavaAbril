package com.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity //convierte un POJO en una entidad de base de datos
@Table(name="CLIENTES") //Define que tabla estará mapeando
public class Cliente {
	
	
	
	@Id //Indica que atributo se usará como clave principal
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER") //Señalar que columna y que tipo de dato mapea
	//cada atributo
	
	//Configura cual sera el modo de generacion de id´s, y se le asigna un nombre de generador
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	//Recuperar el nombre del generador amarrandolo a una secuencia de db
	@SequenceGenerator(name="cid_auto", sequenceName="CLIENTES_SEQ")
	private int clienteId;
	
	
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	
	@Column(name="TELEFONO", columnDefinition="NVARCHAR2(10)")
	private String telefono;
	
	@Column(name="CORREO", columnDefinition="NVARCHAR2(15)")
	private String correo;
	
	public Cliente() {
		
	}
	
	//Obligatorio este metodo constructor con 1 parametro
	public Cliente(int id) {
		this.clienteId = id;
	}

	public Cliente(int clienteId, String nombre, String telefono, String correo) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nombre=" + nombre + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}
	

}
