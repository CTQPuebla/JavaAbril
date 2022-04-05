package com;



public abstract class Celular {
	
	
	private String modelo, marca, material;
	private int numBotones;
	
	public Celular() {
		
	}

	public Celular(String modelo, String marca, String material, int numBotones) {
		this.modelo = modelo;
		this.marca = marca;
		this.material = material;
		this.numBotones = numBotones;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumBotones() {
		return numBotones;
	}

	public void setNumBotones(int numBotones) {
		this.numBotones = numBotones;
	}

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", material=" + material + ", numBotones="
				+ numBotones + "]";
	}
	
	//Comportamiento propio
	public void llamar(String numero) {
		System.out.println("Llamando al numero: "+numero);
	}
	
	public void mandarMsj(String mensaje, String numero) {
		System.out.println("Enviando "+ mensaje +" numero: "+numero);	
	}
	

	//Metodo abstracto
	public abstract void reproducirMusica();
	

}
