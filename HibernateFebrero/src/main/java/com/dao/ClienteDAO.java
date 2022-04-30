package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entitys.Cliente;
import com.general.Metodos;

public class ClienteDAO implements Metodos{
	
	//Carga los objetos (las clases definidas en el persistance
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

		//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	
	Cliente c = null;
	String resultado = null;
	

	@Override
	public String guardar(Object ob) {
		c = (Cliente) ob;
		//Inicia la transaccion
		em.getTransaction().begin();
		try {
			//Aqui se realiza el guardado o persistencia
			em.persist(c);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Insertado");
		}catch(Exception ex) {
			//Deshace los cambios
			em.getTransaction().rollback();
			System.out.println("No se pudo insertar");
			resultado = ex.getMessage();
			
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		
		c = (Cliente) ob;
		
		//Objeto que contiene la informacion que existe en la db
		Cliente clientedb = em.find(Cliente.class, c.getClienteId());
		
		String r = null;
		em.getTransaction().begin();
		try {
			clientedb.setNombre(c.getNombre());
			clientedb.setCorreo(c.getCorreo());
			clientedb.setTelefono(c.getTelefono());
			em.getTransaction().commit();
			System.out.println("Editado");
			r="1";
			
		}catch(Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = ex.getMessage();
		}
		return r;

	}

	@Override
	public String eliminar(int id) {
		
		String r = null;
		
		c = em.find(Cliente.class, id);
		em.getTransaction().begin();
		try {
			em.remove(c);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
			
		}catch(Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = ex.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		c = em.find(Cliente.class, id);
		return c;
	}

	@Override
	public List mostrar() {
		List<Cliente> list = em.createQuery("from Cliente").getResultList();
		return list;
	}
	

	public List<Object> ventasPorCliente(String nombre) {		
		List<Object> list =
				em.createQuery("SELECT c.clienteId as CLIENTE_ID, c.nombre as NOMBRE, v.fechaVenta as FECHA from Cliente c INNER JOIN Ventas v ON"
						+ " c.clienteId =v.clienteId WHERE c.nombre = :nombre")
				.setParameter("nombre", nombre).getResultList();	
		System.out.println(list);
		return list;
		
	}

}
