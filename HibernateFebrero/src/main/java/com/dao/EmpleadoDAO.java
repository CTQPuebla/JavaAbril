package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entitys.Cargo;
import com.entitys.Empleados;
import com.general.Metodos;

public class EmpleadoDAO implements Metodos {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

	// Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();

	Empleados e = null;
	String resultado = null;

	@Override
	public String guardar(Object ob) {
		e = (Empleados) ob;
		// Inicia la transaccion
		em.getTransaction().begin();
		try {
			// Aqui se realiza el guardado o persistencia
			em.persist(e);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Insertado");
		} catch (Exception ex) {
			// Deshace los cambios
			em.getTransaction().rollback();
			System.out.println("No se pudo insertar");
			resultado = ex.getMessage();

		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {

		e = (Empleados) ob;

		// Objeto que contiene la informacion que existe en la db
		Empleados empleadodb = em.find(Empleados.class, e.getEmpleadoId());
		
		//Cargo cargo = em.find(Cargo.class, e.getCargo().getCargoId());

		String r = null;
		em.getTransaction().begin();
		try {
			empleadodb.setNombre(e.getNombre());
			empleadodb.setEstadoCivil(e.getEstadoCivil());
			empleadodb.setFechaNac(e.getFechaNac());
			empleadodb.setSexo(e.getSexo());
			empleadodb.setAntiguedad(e.getAntiguedad());
			//empleadodb.setCargo(cargo);
			
			em.getTransaction().commit();
			System.out.println("Editado");
			r = "1";

		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = ex.getMessage();
		}
		return r;

	}

	@Override
	public String eliminar(int id) {

		String r = null;

		e = em.find(Empleados.class, id);
		em.getTransaction().begin();
		try {
			em.remove(e);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";

		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = ex.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		e = em.find(Empleados.class, id);
		return e;
	}

	@Override
	public List mostrar() {
		List<Empleados> list = em.createQuery("from Empleados").getResultList();
		return list;
	}

}
