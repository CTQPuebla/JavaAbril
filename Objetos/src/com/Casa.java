package com;

public class Casa {
	
	//Atributos
	String color;
	double tamañom2;
	String material;
	int numCuartos;
	int baños;
	
	//Constructores
	public Casa() {
		
	}
	
	//Constructor con 1 parametro
	public Casa(String color) {
		this.color = color;
		
	}

	public Casa(String color, double tamañom2, String material, int numCuartos, int baños) {
		this.color = color;
		this.tamañom2 = tamañom2;
		this.material = material;
		this.numCuartos = numCuartos;
		this.baños = baños;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamañom2() {
		return tamañom2;
	}

	public void setTamañom2(double tamañom2) {
		this.tamañom2 = tamañom2;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumCuartos() {
		return numCuartos;
	}

	public void setNumCuartos(int numCuartos) {
		this.numCuartos = numCuartos;
	}

	public int getBaños() {
		return baños;
	}

	public void setBaños(int baños) {
		this.baños = baños;
	}

	@Override
	public String toString() {
		return "Casa [color=" + color + ", tamañom2=" + tamañom2 + ", material=" + material + ", numCuartos="
				+ numCuartos + ", baños=" + baños + "]";
	}
	
	
	//Comportamiento del objeto
	
	public void subirCortinas() {
		System.out.println("Subiendo cortinas...");		
	}

}
