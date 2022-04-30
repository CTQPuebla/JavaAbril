package com;

import java.util.List;

public interface Metodos {
	
	void agregar(Object c);
	void editar(Object c);
	Object buscar(String nombre);
	void eliminar(String nombre);
	List<Object> buscarPorPais(String pais);
	

}
