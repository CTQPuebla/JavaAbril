package com.msclientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclientes.service.ClientesService;
import com.persistence.entity.Clientes;

@RestController
@RequestMapping("api/clientes/")
public class ClientesController {
	
	@Autowired
	ClientesService service;
	
	@GetMapping("buscar-por-id/{id}")
	public Clientes buscarPorId(@PathVariable int id) {
		
		return service.buscar(id);
	}

}
