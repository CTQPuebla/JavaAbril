package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.CargoDAO;
import com.dto.CargoDTO;
import com.entitys.Cargo;
import com.general.Status;

@Path("cargo/")
public class CargoService {

	Cargo c = null;
	CargoDAO dao = null;

	// "empleado/guardar/"
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Cargo c) {
		Status s = new Status();

		// Inserto el objeto que estoy a punto de guardar
		// dentro del objeto que me entrega el servidor
		s.setOb(c);

		// Llamo a una instancia del objeto DAO
		dao = new CargoDAO();

		// Invoco al metodo guardar del DAO y almaceno su respuesta en r
		String r = dao.guardar(c);

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
	public List<Cargo> mostrarTodos() {
		dao = new CargoDAO();
		return dao.mostrar();
	}

	@Path("buscar-por-id/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Cargo buscar(@PathParam("id") int id) {
		dao = new CargoDAO();
		Cargo c = (Cargo) dao.buscar(id);
		return c;
	}

	@Path("eliminar/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(c);

		dao = new CargoDAO();
		String res = dao.eliminar(id);

		if (res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible eliminar este registro");
			state.setRespuesta(res);
		}
		return state;
	}

	@Path("actualizar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status editar(Cargo c) {
		Status s = new Status();
		// Inserto el objeto que estoy a punto de guardar
		// dentro del objeto que me entrega el servidor
		s.setOb(c);
		// Llamo a una instancia del objeto DAO
		dao = new CargoDAO();
		// Invoco al metodo editar del DAO y almaceno su respuesta en r
		String r = dao.editar(c);
		if (r.equals("1")) {
			s.setMensaje("Actualizado exitosamente");
			s.setRespuesta(r);
		} else {
			s.setMensaje("No fue posible actualizar");
			s.setRespuesta(r);
		}
		return s;
	}
	
	//http://localhost:8085/JDBCconexion_c/JDBCconexion_c/cargo/empleados-por-cargo/
	@Path("empleados-por-cargo/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public CargoDTO empleadosPorCargo(@PathParam("id") int id) {
		dao = new CargoDAO();
		CargoDTO dto = (CargoDTO) dao.empleadosPorCargo(id);
		return dto;
	}

}
