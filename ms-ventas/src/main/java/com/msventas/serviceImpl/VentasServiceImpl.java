package com.msventas.serviceImpl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentasService;
import com.persistence.dto.DetallesDTO;
import com.persistence.dto.VentasDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetalleVenta;
import com.persistence.entity.Productos;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetalleVentasRepository;
import com.persistence.repository.ProductoRepository;
import com.persistence.repository.VentasRepository;


@Service
public class VentasServiceImpl implements VentasService {

	@Autowired
	VentasRepository vRepo;

	@Autowired
	ClienteRepository cRepo; //extra

	@Autowired
	ProductoRepository pRepo;

	@Autowired
	DetalleVentasRepository dtRepo; //extra

	RestTemplate plantilla = new RestTemplate(); //Telefono
	

	@Override
	public Ventas guardar(VentasDTO dto) {
	

		// Se toma la fecha del sistema, casteandola a sql.date
		// 1-Enero-1970
		java.sql.Date fecha = new java.sql.Date(System.currentTimeMillis());
		
		

		// Busca al cliente activo
		//Clientes cliente = cRepo.buscarActivo(dto.getClienteId());
		int clienteId = dto.getClienteId();
		Clientes cliente = plantilla.getForObject("http://localhost:8088/api/clientes/buscar-por-id/"+clienteId, Clientes.class);

		// Persiste la venta para poder recuperar el id y utilizarlo en la insercion de
		// detalle_venta
		Ventas v = new Ventas();
		v.setCliente(cliente);
		v.setFechaVenta(fecha);
		
		//Guardo la venta
		vRepo.save(v);

		// Iterando sobre la lista de objetos detalle(productoId,cantidad)
		for (DetallesDTO ddto : dto.getDetalles()) {

			// Busqueda del objeto producto que rellena cada detalle
			
			//Productos p = pRepo.filtrarPorId(ddto.getProductoId());
			int productoId = ddto.getProductoId();
			Productos p = plantilla.getForObject("http://localhost:8086/api/productos/buscar-por-id/"+productoId, Productos.class);
			
			//Objeto detalle vacio
			DetalleVenta detalle = new DetalleVenta();

			// Llenado de los valores de la entidad DetalleVenta
			detalle.setVenta(v);
			detalle.setProducto(p);
			detalle.setCantidad(ddto.getCantidad());

			// Guarda el objeto creado
			dtRepo.save(detalle);

		}

		return v;
	}

}
