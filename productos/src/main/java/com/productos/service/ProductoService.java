package com.productos.service;

import java.util.List;

import com.persistence.entity.Productos;
import com.persistence.request.ProductoRequest;


public interface ProductoService {
	
	Productos agregar(ProductoRequest p);
	Productos buscarPorId(int id);
	Productos buscarPorNombre(String nombre);
	Productos editar(ProductoRequest e);
	String eliminar(String nombre);
	List<Productos> mostrarTodos();
	

}
