package com.msclientes.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclientes.service.ClientesService;
import com.persistence.entity.Clientes;
import com.persistence.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClientesService{
	
	@Autowired
	ClienteRepository repo;

	@Override
	public Clientes buscar(int id) {			
		return repo.buscarActivo(id);
	}

}
