package com;

public class Colibri extends Animal{
	
	int aps;
	double longPico;
	String habitat;
	
	public Colibri() {
		
	}
	
	
	public Colibri(String nombre, String especie, double peso, String color, int aps, double longPico, String habitat) {
		super(nombre, especie, peso, color);
		this.aps = aps;
		this.longPico = longPico;
		this.habitat = habitat;
	}

	public Colibri(int aps, double longPico, String habitat) {
		this.aps = aps;
		this.longPico = longPico;
		this.habitat = habitat;
	}

	public int getAps() {
		return aps;
	}

	public void setAps(int aps) {
		this.aps = aps;
	}

	public double getLongPico() {
		return longPico;
	}

	public void setLongPico(double longPico) {
		this.longPico = longPico;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	@Override
	public String toString() {
		return "Colibri [aps=" + aps + ", longPico=" + longPico + ", habitat=" + habitat + ", nombre=" + nombre
				+ ", especie=" + especie + ", peso=" + peso + ", color=" + color + "]";
	}


}
