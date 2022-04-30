package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Implementacion implements Metodos{
	
	HashMap<String, Contacto> agenda = new HashMap<String, Contacto>();
	List<Object> resultados = new ArrayList<Contacto>();

	@Override
	public void agregar(Object c) {
		Contacto co = (Contacto) c;
		this.agenda.put(co.getNombre(), co);
		
	}

	@Override
	public void editar(Object c) {
		this.agenda.put(c.getNombre(), c);
		
	}

	@Override
	public Contacto buscar(String nombre) {
		
		return agenda.get(nombre);
		
	}

	@Override
	public void eliminar(String nombre) {
		this.agenda.remove(nombre);
		
	}

	@Override
	public List<Object> buscarPorPais(String pais) {
		
		//Recorre la lista de contactos
		for(String key:agenda.keySet()) {
			//Comprueba si el contacto actual coincide con el pais
			if(agenda.get(key).getPais().equals(pais)) {
				//Agrego el elemento actual a la lista de resultados
				resultados.add(agenda.get(key));
			}
		}
		return resultados;
	}

}
