package com;

public class Usuario {
	
	String nombre, correo, contrase�a;
	
	
	//Inicializa el hash
	
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String correo, String contrase�a) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", contrase�a=" + contrase�a + "]";
	}
	
	
}
