package com;

public class ClaseDos extends ClaseUno{

	boolean indicador;

	public ClaseDos(String atributo1, int atributo2, double atributo3, boolean indicador) {
		super(atributo1, atributo2, atributo3);
		this.indicador = indicador;
	}

	public boolean isIndicador() {
		return indicador;
	}

	public void setIndicador(boolean indicador) {
		this.indicador = indicador;
	}

	@Override
	public String toString() {
		return "ClaseDos [indicador=" + indicador + ", atributo1=" + atributo1 + ", atributo2=" + atributo2
				+ ", atributo3=" + atributo3 + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
