package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//Instanciar un objeto de una clase		
//		PC pc = new PC();	
//	
//		pc.setMarca("Toshiba");
//		
//						
//		System.out.println(pc);
//		
//		PC pc2 = new PC("Compaq", "Presario 1", "16 inch", "Serie 10", 150.30, false);		
//		System.out.println(pc2);
		
		
		//Creacion de productos individualmente
		Producto p1 = new Producto("A1","Emperador", "Paquete 8 unidades", 18.0);
		Producto p2 = new Producto("A2","Cacahuates", "Bolsa 60 grs", 20.0);
		Producto p3 = new Producto("A3","Paleta", "Unidad", 10.0);
		Producto p4 = new Producto("A4","Gansito", "Paquete 70 grs", 14.0);
		Producto p5 = new Producto("A5","Chicles", "Paquete 20 unidades", 15.0);
		
		//Inicializacion del array
		Producto[] productos = new Producto[5];
		
		//Añade los productos al array
		productos[0] = p1;
		productos[1] = p2;
		productos[2] = p3;
		productos[3] = p4;
		productos[4] = p5;
		
		MaquinaExpendedora m1 = new MaquinaExpendedora("Negro", "F1", 140.0, productos, 0);
		
		
		m1.venderProducto();
		
		System.out.println(m1);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
	

}
