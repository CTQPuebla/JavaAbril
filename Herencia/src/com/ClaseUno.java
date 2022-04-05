package com;

public class ClaseUno {
	
	String atributo1;
	int atributo2;
	double atributo3;
	
	
	public ClaseUno() {
		
	}


	public ClaseUno(String atributo1, int atributo2, double atributo3) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}


	public String getAtributo1() {
		return atributo1;
	}


	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}


	public int getAtributo2() {
		return atributo2;
	}


	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}


	public double getAtributo3() {
		return atributo3;
	}


	public void setAtributo3(double atributo3) {
		this.atributo3 = atributo3;
	}


	@Override
	public String toString() {
		return "ClaseUno [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}
	

}
