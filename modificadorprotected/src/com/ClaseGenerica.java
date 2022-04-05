package com;

public class ClaseGenerica {
	
	public static void main(String[] args) {
		
		//Instancia de clase que hereda a Casa
		CasaHeredada ch = new CasaHeredada();
		ch.color="Morado";
		
		System.out.println(ch.color);
		
		
		
		
		//Instancia de la clase con atributos protected
		Casa casa = new Casa();
		
		//Valor mediante el setter del objeto
		casa.setColor("Azul");
		System.out.println(casa.getColor());
		
		//Valor directo al atributo de clase
		casa.color = "Rojo";
		System.out.println(casa.color);
	}

}
