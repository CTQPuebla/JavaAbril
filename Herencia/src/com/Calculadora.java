package com;

public abstract class Calculadora {

	String fuenteEnergia;
	double operadorUno, operadorDos;
	double resultado;
	int digitosPantalla;
	String operacion;

	public Calculadora() {

	}

	public Calculadora(String fuenteEnergia, double operadorUno, double operadorDos, double resultado,
			int digitosPantalla, String operacion) {
		this.fuenteEnergia = fuenteEnergia;
		this.operadorUno = operadorUno;
		this.operadorDos = operadorDos;
		this.resultado = resultado;
		this.digitosPantalla = digitosPantalla;
		this.operacion = operacion;
	}

	public String getFuenteEnergia() {
		return fuenteEnergia;
	}

	public void setFuenteEnergia(String fuenteEnergia) {
		this.fuenteEnergia = fuenteEnergia;
	}

	public double getOperadorUno() {
		return operadorUno;
	}

	public void setOperadorUno(double operadorUno) {
		this.operadorUno = operadorUno;
	}

	public double getOperadorDos() {
		return operadorDos;
	}

	public void setOperadorDos(double operadorDos) {
		this.operadorDos = operadorDos;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public int getDigitosPantalla() {
		return digitosPantalla;
	}

	public void setDigitosPantalla(int digitosPantalla) {
		this.digitosPantalla = digitosPantalla;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	@Override
	public String toString() {
		return "Calculadora [fuenteEnergia=" + fuenteEnergia + ", operadorUno=" + operadorUno + ", operadorDos="
				+ operadorDos + ", resultado=" + resultado + ", digitosPantalla=" + digitosPantalla + ", operacion="
				+ operacion + "]";
	}

	public double realizarOperacion(String operacion, double a, double b) {

		System.out.println("primero");
		switch (operacion) {

		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;

		default:
			return 0;

		}

	}

	public double realizarOperacion() {

		System.out.println("segundo");
		
		
		switch (operacion) {

		case "+":
			return operadorUno + operadorDos;
		case "-":
			return operadorUno - operadorDos;
		case "*":
			return operadorUno * operadorDos;
		case "/":
			return operadorUno / operadorDos;

		default:
			return 0;

		}
	}

	public abstract double sumar(double a, double b);

	public abstract double restar(double a, double b);

	public abstract double multiplicar(double a, double b);

	public abstract double dividir(double a, double b);

}
