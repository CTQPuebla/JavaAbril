package com.msventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msventas.service.VentasService;
import com.persistence.dto.VentasDTO;
import com.persistence.entity.Ventas;

@RestController
@RequestMapping("api/ventas/")
public class VentasController {
	
	@Autowired
	VentasService service;
	
	@PostMapping("guardar")
	public Ventas guardar(@RequestBody VentasDTO dto) {						
		return service.guardar(dto);
	}
	
	
	

}
