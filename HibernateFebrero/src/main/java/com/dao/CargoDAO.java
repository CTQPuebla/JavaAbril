package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entitys.Cargo;
import com.general.Metodos;

public class CargoDAO implements Metodos{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

	// Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();

	Cargo c = null;
	String resultado = null;

	@Override
	public String guardar(Object ob) {
		c = (Cargo) ob;
		// Inicia la transaccion
		em.getTransaction().begin();
		try {
			// Aqui se realiza el guardado o persistencia
			em.persist(c);
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

		c = (Cargo) ob;

		// Objeto que contiene la informacion que existe en la db
		Cargo cargodb = em.find(Cargo.class, c.getCargoId());

		String r = null;
		em.getTransaction().begin();
		try {
			cargodb.setDescripcion(c.getDescripcion());
			cargodb.setSueldo(c.getSueldo());
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

		c = em.find(Cargo.class, id);
		em.getTransaction().begin();
		try {
			em.remove(c);
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
		c = em.find(Cargo.class, id);
		return c;
	}

	@Override
	public List mostrar() {
		List<Cargo> list = em.createQuery("from Cargo").getResultList();
		return list;
	}

}
