package com;

public class Principal {
	
	public static void main(String[] args) {
		
//		ClaseUno padre = new ClaseUno();
//		
//		padre.setAtributo1("Hola esto es un String");
//		padre.setAtributo2(10);
//		padre.setAtributo3(1.345);
//		
//		ClaseDos hijo = new ClaseDos("String en el objeto hijo", 9, 0.345, false);
		
//		hijo.setAtributo1("");
//		hijo.setAtributo2(9);
//		hijo.setAtributo3(0.345);
		
//		System.out.println(padre);
//		System.out.println(hijo);
		
		
		Celular c = new Celular("1100", "NOKIA", "PLASTICO", 20);
		
		c.llamar("0987654321");
		c.mandarMsj("hola", "11234567890");
		
		//Esta accion no es posible hacerla dado que
		//La herencia no funciona de de manera ascendente
		
		//c.transferirArchivosInfrarrojo();
		//c.tomarFoto();
		
		
		CelularBasico cb = new CelularBasico(false, false);
		
		cb.setMarca("Samsung");
		cb.setMaterial("Policarbonato");
		cb.setModelo("m1");
		
		cb.llamar("09876543");
		cb.mandarMsj("hola", "11234567890");
		
		
		cb.encenderLinterna();
		cb.apagarLinterna();
		cb.transferirArchivosInfrarrojo();
		
		Camara cm = new Camara(20.3, "optico", 1.5, 4000);
		
		Smartphone sm = new Smartphone(64, true, cm);
		//Smartphone sm2 = new Smartphone(null, null, null, 0, 0, false, cm);
		
		sm.setMarca("Xiaomi");
		sm.setModelo("M1");
		sm.setNumBotones(1);
		sm.setMaterial("Metal");
		
		sm.tomarFoto();		
		
		System.out.println(c);
		System.out.println(cb);
		System.out.println(sm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
