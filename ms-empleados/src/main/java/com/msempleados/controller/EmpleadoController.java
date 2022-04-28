package com.msempleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msempleados.service.EmpleadoService;
import com.persistence.entity.Empleado;
import com.persistence.request.EmpleadoRequest;

@RestController
@RequestMapping("api/empleado/")
@CrossOrigin(origins="*")
public class EmpleadoController {
	
	@Autowired
	EmpleadoService service;
	
	
	@GetMapping("listar-empleados")
	List<Empleado> mostrar(){		
		return service.mostrarTodos();		
	}
	
	@PostMapping("añadir")
	public Empleado guardar(@RequestBody EmpleadoRequest req) {		
		return service.agregar(req);
		
	}
	
	@PutMapping("actualizar")
	public Empleado actualizar(@RequestBody EmpleadoRequest req) {		
		return service.editar(req);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public Empleado buscar(@PathVariable int id) {		
		return service.buscar(id); 
	}
	
	@DeleteMapping("eliminar/{nombre}")
	public String eliminar(@PathVariable String nombre) {		
		return service.eliminar(nombre);		
	}
	
	@GetMapping("buscar-por-nombre/{nombre}")
	public Empleado buscarPorNombre(@PathVariable String nombre) {		
		return service.buscar(nombre);
	}
	
	
	

}
