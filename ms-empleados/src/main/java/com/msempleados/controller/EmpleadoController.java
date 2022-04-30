package com.msempleados.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msempleados.service.EmpleadosService;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadosRequest;

@RestController
//@RequestMapping("empleado/")
public class EmpleadoController {
	
	@Autowired
	EmpleadosService srv;
	
	//http://localhost:8090/empleado/mostrar-todos
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Empleados>> listar(){
		List<Empleados> list  = srv.mostrar();
		return new ResponseEntity<List<Empleados>>(list, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<Empleados> buscar(@PathVariable int id){
		Empleados e = srv.buscar(id);			
		return new ResponseEntity<Empleados>( e, HttpStatus.OK);
	}
	
	//http://localhost:8090/empleado/guardar-empleado
	@PostMapping("guardar-empleado")
	public ResponseEntity<Empleados> guardar(@Valid @RequestBody EmpleadosRequest req) {
		System.out.println("Controller: "+req.getNombre());
		Empleados e = srv.guardar(req);
		return new ResponseEntity<Empleados>( e,HttpStatus.OK);
	}
	
	//http://localhost:8090/empleado/guardar-empleado
	@PutMapping("actualizar-empleado")
	public ResponseEntity<Empleados> actualizar(@Valid @RequestBody EmpleadosRequest req) {
		System.out.println("Controller: "+req.getNombre());
		Empleados e = srv.actualizar(req);
		return new ResponseEntity<Empleados>( e,HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String mensaje = srv.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
	

}
