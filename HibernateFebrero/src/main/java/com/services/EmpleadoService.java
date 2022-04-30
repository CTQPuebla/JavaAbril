package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.EmpleadoDAO;
import com.entitys.Empleados;
import com.general.Status;

@Path("empleado/")
public class EmpleadoService {
	
	Empleados e = null;
	EmpleadoDAO dao = null;
	
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Empleados> mostrar(){
		dao = new EmpleadoDAO();
		List<Empleados> list = dao.mostrar();
		System.out.println("Lista: "+list);		
		return list;
	}
	
	@Path("guardar") 
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Empleados e) {
		System.out.println("Departamento a guardar: "+e);
		Status state = new Status();
		state.setOb(e);
		
		dao = new EmpleadoDAO();
		String res = dao.guardar(e);
		
		if (res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);			
		}		
		return state;
	}
	
	
	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})	
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(e);
		
		dao = new EmpleadoDAO();
		String res = dao.eliminar(id);
		
		if (res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible eliminar este registro");
			state.setRespuesta(res);			
		}		
		return state;
	}
	
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})	
	public Status editar(Empleados c) {
		Status state = new Status();
		state.setOb(e);
		
		dao = new EmpleadoDAO();
		String res = dao.editar(e);
		
		if (res.equals("1")) {
			state.setMensaje("Actualizado correctamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);			
		}		
		return state;
	}
	
	@Path("buscar-por-id/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})	
	public Empleados buscar(@PathParam("id") int id) {
		dao = new EmpleadoDAO();
		e = (Empleados) dao.buscar(id);
		System.out.println("Se encontró el registro");
		return e;
	}

}
