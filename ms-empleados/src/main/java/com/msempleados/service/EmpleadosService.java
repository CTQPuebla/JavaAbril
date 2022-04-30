package com.msempleados.service;

import java.util.List;

import com.msempleados.exception.BusinessException;
import com.msempleados.exception.ResourceNotFoundException;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadosRequest;

public interface EmpleadosService {
	
	List<Empleados> mostrar() throws ResourceNotFoundException;
	Empleados guardar(EmpleadosRequest req) throws BusinessException;
	Empleados actualizar(EmpleadosRequest req) throws BusinessException;
	Empleados buscar(int id) throws ResourceNotFoundException;
	String eliminar(int id) throws ResourceNotFoundException;

}