package com;

public class Casa {
	
	//Atributos
	String color;
	double tama�om2;
	String material;
	int numCuartos;
	int ba�os;
	
	//Constructores
	public Casa() {
		
	}
	
	//Constructor con 1 parametro
	public Casa(String color) {
		this.color = color;
		
	}

	public Casa(String color, double tama�om2, String material, int numCuartos, int ba�os) {
		this.color = color;
		this.tama�om2 = tama�om2;
		this.material = material;
		this.numCuartos = numCuartos;
		this.ba�os = ba�os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTama�om2() {
		return tama�om2;
	}

	public void setTama�om2(double tama�om2) {
		this.tama�om2 = tama�om2;
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

	public int getBa�os() {
		return ba�os;
	}

	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}

	@Override
	public String toString() {
		return "Casa [color=" + color + ", tama�om2=" + tama�om2 + ", material=" + material + ", numCuartos="
				+ numCuartos + ", ba�os=" + ba�os + "]";
	}
	
	
	//Comportamiento del objeto
	
	public void subirCortinas() {
		System.out.println("Subiendo cortinas...");		
	}

}
