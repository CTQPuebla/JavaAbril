package com.msempleados.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.exception.BusinessException;
import com.msempleados.exception.ResourceNotFoundException;
import com.msempleados.service.EmpleadosService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.EmpleadosRequest;

@Service
public class EmpleadoImpl implements EmpleadosService {

	@Autowired
	EmpleadoRepository repo;

	@Override
	public List<Empleados> mostrar() {
		
		if(repo.validateTable()>0) {			
			return repo.getEmpleadosActivos();			
		}else {
			throw new ResourceNotFoundException("No existen registros en la tabla");
		}		
	}

	@Override // Algunos datos se validaron dentro del request
	public Empleados guardar(EmpleadosRequest req) {
		if (repo.validarPorNombre(req.getNombre()) > 0) {
			throw new BusinessException(1);

		} else if (!(req.getSexo().equals("M") || req.getSexo().equals("F"))) {

			throw new BusinessException(2);
		} else if (!(req.getEstadoCivil().equals("SOLTERO") || req.getEstadoCivil().equals("CASADO")
				|| req.getEstadoCivil().equals("VIUDO") || req.getEstadoCivil().equals("DIVORCIADO"))) {
			throw new BusinessException(3);
		} else {
			Empleados e = new Empleados();
			e.setNombre(req.getNombre());
			e.setFechaRegistro(LocalDateTime.now()); //Toma la fecha de sistema
			e.setEstadoCivil(req.getEstadoCivil());
			e.setFechaNac(req.getFechaNac());
			e.setSexo(req.getSexo());
			e.setCargoId(req.getCargoId());
			e.setStatus(1);
			repo.save(e);
			return e;
		}
	}

	@Override
	public Empleados actualizar(EmpleadosRequest req) {

		// Optional
		if (repo.findPorId(req.getEmpleadoId())>0) {
			Empleados em = repo.buscarPorId(req.getEmpleadoId());

			// Comparo el nombre del objeto de la db contra el nombre del request
			if (em.getNombre().equals(req.getNombre())) {
				throw new BusinessException(1);

			} else if (!(req.getSexo().equals("M") || req.getSexo().equals("F"))) {
				throw new BusinessException(2);
			} else if (!(req.getEstadoCivil() != "SOLTERO" || req.getEstadoCivil() != "CASADO"
					|| req.getEstadoCivil() != "VIUDO" || req.getEstadoCivil() != "DIVORCIADO")) {
				throw new BusinessException(3);
			} else {
				
				em.setNombre(req.getNombre());
				em.setEstadoCivil(req.getEstadoCivil());
				em.setFechaNac(req.getFechaNac());
				em.setSexo(req.getSexo());
				em.setCargoId(req.getCargoId());
				repo.save(em);
				return em;

			}
		} else {
			throw new ResourceNotFoundException("No existe un recurso con el id: " + req.getEmpleadoId());
		}

	}

	@Override
	public Empleados buscar(int id) {

		if (repo.findPorId(id)>0) {
			return repo.buscarPorId(id);
		} else {
			throw new ResourceNotFoundException("No existe un recurso con el id: " + id);
		}

	}

	@Override
	public String eliminar(int id) {
		
		// Borrado logico		
		if (repo.findPorId(id)>0) {
			Empleados em = repo.buscarPorId(id);
			em.setStatus(0);
			repo.save(em);
			return "Eliminado";
		} else {
			throw new ResourceNotFoundException("No existe un recurso con el id: " + id);
		}

		// Borrado fisico
		// repo.deleteById(id);
		
	}

}
