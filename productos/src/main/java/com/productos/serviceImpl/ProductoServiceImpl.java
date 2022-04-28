package com.productos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.entity.Productos;
import com.persistence.repository.ProductoRepository;
import com.persistence.request.ProductoRequest;
import com.productos.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository repo;

	@Override
	public Productos agregar(ProductoRequest p) {
		Productos pro = new Productos();
		pro.setNombre(p.getNombre());
		pro.setMarca(p.getMarca());
		pro.setPrecio(p.getPrecio());
		pro.setFechaCad(p.getFechaCad());
		pro.setPresentacion(p.getPresentacion());
		pro.setStatus(1);

		repo.save(pro);
		return pro;
	}

	@Override
	public Productos buscarPorId(int id) {
		
		Productos pro = repo.filtrarPorId(id);		
		return pro;
	}

	@Override
	public Productos buscarPorNombre(String nombre) {
		return repo.filtrarPorNombre(nombre);
	}

	@Override
	public Productos editar(ProductoRequest pr) {
		Productos pro = repo.filtrarPorId(pr.getProductoId());
		
		pro.setNombre(pr.getNombre());
		pro.setMarca(pr.getMarca());
		pro.setPrecio(pr.getPrecio());
		pro.setFechaCad(pr.getFechaCad());
		pro.setPresentacion(pr.getPresentacion());		
		repo.save(pro);
		return pro;
	}

	@Override
	public String eliminar(String nombre) {
		Productos pro = repo.filtrarPorNombre(nombre);
		pro.setStatus(0);
		repo.save(pro);
		return "Eliminado";
	}

	@Override
	public List<Productos> mostrarTodos() {
		// TODO Auto-generated method stub
		return repo.buscarProductos();
	}

}
