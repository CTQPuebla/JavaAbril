package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadoService;
import com.persistence.entity.Empleado;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.EmpleadoRequest;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepository repo;

	@Override
	public Empleado agregar(EmpleadoRequest e) {
		// 1 activo 0 desactivado

		Empleado em = new Empleado();

		em.setNombre(e.getNombre());
		em.setEstadoCivil(e.getEstadoCivil());
		em.setAntiguedad(e.getAntiguedad());
		em.setFechaNac(e.getFechaNac());
		em.setSexo(e.getSexo());
		em.setCargoId(e.getCargoId());
		em.setStatus(1);

		repo.save(em);
		return em;
	}

	@Override
	public Empleado buscar(String nombre) {
		Empleado em = repo.buscarActivo(nombre);
		return em;
	}

	@Override
	public Empleado editar(EmpleadoRequest e) {

		Empleado em = repo.buscarActivo(e.getNombre());

		em.setNombre(e.getNombre());
		em.setEstadoCivil(e.getEstadoCivil());
		em.setAntiguedad(e.getAntiguedad());
		em.setFechaNac(e.getFechaNac());
		em.setSexo(e.getSexo());
		em.setCargoId(e.getCargoId());

		repo.save(em);
		return em;
	}

	@Override
	public String eliminar(String nombre) {
		Empleado e = repo.buscarActivo(nombre);
		e.setStatus(0);
		repo.save(e);
		return "Eliminado";
	}

	@Override
	public List<Empleado> mostrarTodos() {
		return repo.buscarActivos();
	}

	@Override
	public Empleado buscar(int id) {		
		Empleado em = repo.buscarActivo(id);
		return em;
	}

}
