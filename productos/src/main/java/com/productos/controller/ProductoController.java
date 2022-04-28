package com.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistence.entity.Productos;
import com.persistence.request.ProductoRequest;
import com.productos.service.ProductoService;

@RestController
@RequestMapping("api/productos/")
public class ProductoController {
	
	@Autowired
	ProductoService service;
	
	@GetMapping("listar-todos")
	public List<Productos> mostrar(){		
		return service.mostrarTodos();
	}	
	
	@PostMapping("guardar")
	public Productos guardar(@RequestBody ProductoRequest req) {		
		return service.agregar(req);
	}
		
	@PutMapping("actualizar")
	public Productos actualizar(@RequestBody ProductoRequest req) {
		return service.editar(req);
	}
	
	
	@GetMapping("buscar-por-id/{id}")
	public Productos buscarPorId(@PathVariable int id) {			
		return service.buscarPorId(id);
	}
	
	@DeleteMapping("eliminar/{nombre}")
	public String eliminar(@PathVariable String nombre) {			
		return service.eliminar(nombre);
	}
	
	@GetMapping("buscar-por-nombre/{nombre}")
	public Productos buscarPorNombre(@PathVariable String nombre) {			
		return service.buscarPorNombre(nombre);
	}
	
}
