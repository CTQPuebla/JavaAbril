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
import com.dto.EmpleadoDTO;
import com.entitys.Empleado;
import com.general.Status;

@Path("empleado/")
public class EmpleadoService {

	Empleado e = null;
	EmpleadoDAO dao = null;

	// "empleado/guardar/"
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Empleado e) {
		Status s = new Status();

		// Inserto el objeto que estoy a punto de guardar
		// dentro del objeto que me entrega el servidor
		s.setOb(e);

		// Llamo a una instancia del objeto DAO
		dao = new EmpleadoDAO();

		// Invoco al metodo guardar del DAO y almaceno su respuesta en r
		String r = dao.guardar(e);

		if (r.equals("1")) {
			s.setMensaje("Guardado exitosamente");
			s.setRespuesta(r);
		} else {
			s.setMensaje("No fue posible guardar");
			s.setRespuesta(r);
		}
		return s;
	}

	@Path("mostrar-todos")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Empleado> mostrarTodos() {
		dao = new EmpleadoDAO();
		return dao.mostrar();
	}
	
	@Path("buscar-por-id/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Empleado buscar(@PathParam("id") int id) {
		dao = new EmpleadoDAO();
		Empleado e = (Empleado) dao.buscar(id);
		return e;
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

	@Path("actualizar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status editar(Empleado e) {
		Status s = new Status();
		// Inserto el objeto que estoy a punto de guardar
		// dentro del objeto que me entrega el servidor
		s.setOb(e);
		// Llamo a una instancia del objeto DAO
		dao = new EmpleadoDAO();
		// Invoco al metodo editar del DAO y almaceno su respuesta en r
		String r = dao.editar(e);
		if (r.equals("1")) {
			s.setMensaje("Actualizado exitosamente");
			s.setRespuesta(r);
		} else {
			s.setMensaje("No fue posible actualizar");
			s.setRespuesta(r);
		}
		return s;
	}

	@Path("empleado-cargo-info/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON })
	public EmpleadoDTO empleadoCargoInfo(@PathParam("id") int id) {
		dao = new EmpleadoDAO();
		EmpleadoDTO edto = dao.mostrarEmpleadoCargo(id);		
		return edto;
	}
	
}
