package com;

public class Principal {
	
	public static void main(String[] args) {
		
//		CuentaBasica cb = new CuentaBasica();
//		CuentaBasica cb2 = new CuentaBasica();
//		
//		cb.setSaldoDisponible(500);
//		cb.setNumCuenta("010");
//		
//		System.out.println(cb2.MINIMO);
		
		Cajero atm1 = new Cajero();
		
		CuentaBasic cuenta1 = new CuentaBasic();
		CuentaBasic cuenta2 = new CuentaBasic();
		cuenta1.setSaldoDisponible(15000);
		cuenta2.setSaldoDisponible(10000);
		
		atm1.tranferir(cuenta1, cuenta2, 850);
		
	}

}
