package com;

public class Cientifica extends Calculadora {

	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double dividir(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	//Comportamiento propio	
	public double seno(double grados) {
		return Math.sin(grados);
	}
	

}
