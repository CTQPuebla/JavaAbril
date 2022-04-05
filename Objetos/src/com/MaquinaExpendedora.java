package com;

import java.util.Arrays;
import java.util.Scanner;

public class MaquinaExpendedora {

	String color;
	String fabricante;
	double peso;
	Producto[] productos;

	double totalVendido = 0;
	int credito = 0;

	boolean flag = true;
	Scanner sc = new Scanner(System.in);

	public MaquinaExpendedora() {

	}

	public MaquinaExpendedora(String color, String fabricante, double peso, Producto[] productos, double totalVendido) {
		this.color = color;
		this.fabricante = fabricante;
		this.peso = peso;
		this.productos = productos;
		this.totalVendido = totalVendido;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}

	@Override
	public String toString() {
		return "MaquinaExpendedora [color=" + color + ", fabricante=" + fabricante + ", peso=" + peso + ", productos="
				+ Arrays.toString(productos) + ", totalVendido=" + totalVendido + "]";
	}
	
	
	
	//COMPORTAMIENTO PARTICULAR
	public double recibeCredito() {
		// Mientras se siga insertando una moneda, sigue
		// convirtiendo a numero el valor de la consola
		// y aumenta el credito
		while (flag) {
			
			try {
				System.out.println("Inserta una moneda");
				credito = credito + sc.nextInt();
				flag = true;

			} catch (Exception ex) {
				flag = false;
			}

		}
		return credito;
	}
	
	public String pedirCodigo() {
		System.out.println("Ingresa el codigo del producto");
		sc.nextLine();
		String codigoBuscado = sc.nextLine();
		
		return codigoBuscado;
	}

	public Producto venderProducto() {

		// Primero, recibe las monedas y retorna un credito disponible
		double creditoDisponible = this.recibeCredito();
		
		//Despues, pide el codigo del producto a buscar
		String code = this.pedirCodigo();
		
		Producto productoVendido=null;

		//Esta condicion evalua si existe el producto
		//[i]["SI"]
		//[null]["NO"]
		if(this.buscarProducto(code)[0]!=null) { //Aseguro que si exista
			int indice =(int) this.buscarProducto(code)[0]; //Obtiene el indice donde se encontro el producto
			
			productoVendido = productos[indice]; //Obtiene el producto en el indice anteriormente captado
			double cambio = this.calcularCambio(productoVendido, creditoDisponible);
			
			//Incrementa el precio que acaba de cobrar por la venta al totalVendido
			totalVendido = totalVendido + productoVendido.getPrecio();
			
			//Nulleando el producto dentro del array (eliminandolo)
			productos[indice] = null;
			
			System.out.println("Compraste: "+productoVendido);
			System.out.println("Cambio : "+cambio);
			return productoVendido;
		}else {
			System.out.println("No hay productos en existencia con ese codigo");
			return productoVendido;
		}


	}
	
	//Retorna array de Object
	//[][]
	public Object[] buscarProducto(String code) {
		
		Object[] resp = new Object[2];
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null && productos[i].getCodigo().equals(code)) {

				resp[0] = i; //7
				resp[1] = "SI";
				return resp;
			} else {
				resp[0] = null;
				resp[1] = "NO";
				
			}
		}
		
		return resp;
		
	}

	public double calcularCambio(Producto p, double creditoD) {
		return creditoD - p.getPrecio();
	}

}
