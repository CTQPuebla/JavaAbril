package com;

public class Usuario {
	
	String nombre, correo, contraseña;
	
	
	//Inicializa el hash
	
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String correo, String contraseña) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", contraseña=" + contraseña + "]";
	}
	
	
}
