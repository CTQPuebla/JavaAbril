package com.msempleados.service;

import java.util.List;

import com.persistence.entity.Empleado;
import com.persistence.request.EmpleadoRequest;

//Interface de negocio
public interface EmpleadoService {
	
	Empleado agregar(EmpleadoRequest e);
	Empleado buscar(String nombre);
	Empleado buscar(int id);
	Empleado editar(EmpleadoRequest e);
	String eliminar(String nombre);
	List<Empleado> mostrarTodos();
	

	

}
