package com;

public class CuentaBanc {

	private double saldoDisponible;
	private String numCuenta;

	public CuentaBanc() {

	}

	public CuentaBanc(double saldoDisponible, String numCuenta) {
		this.saldoDisponible = saldoDisponible;
		this.numCuenta = numCuenta;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldoDisponible=" + saldoDisponible + ", numCuenta=" + numCuenta + "]";
	}
}