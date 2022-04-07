package com;

public class Cajero {

	public String direccion;
	public int id;

	public Cajero() {

	}

	public Cajero(String direccion, int id) {
		this.direccion = direccion;
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void retirar(CuentaPremium cuenta, double monto) {
		
		if (cuenta.getSaldoDisponible() - monto >= cuenta.MINIMO) { // true 1
			// Decrementatr el saldoDisponible
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);

		} else {
			System.out.println("El retiro dejaria la cuenta por debajo del minimo");
		}
		System.out.println("Disponible: "+cuenta.getSaldoDisponible());

	}

	public void retirar(CuentaBasica cuenta, double monto) {
		// Validar que el saldoDisponible - monto >= MINIMO permitido en cuenta
		// retirar (decrementar el saldo Disponible)
		if (cuenta.getSaldoDisponible() - monto >= cuenta.MINIMO) { // true 1
			// Decrementatr el saldoDisponible
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
		} else {
			System.out.println("El retiro dejaria la cuenta por debajo del minimo");
		}
		System.out.println("Disponible: "+cuenta.getSaldoDisponible());
		// Resolver detalle de denominaciones
	}

	public void depositar(CuentaBasica cuenta, double monto) {
		if (cuenta.getSaldoDisponible() + monto <= cuenta.MAXIMO) {
			// Incrementa el saldo disponible
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
		} else {
			System.out.println("El deposito llevaria a la cuenta por encima del maximo permitido");
		}
		
		System.out.println("Origen: "+cuenta.getSaldoDisponible());

	}
	
	public void depositar(CuentaPremium cuenta, double monto) {
		if (cuenta.getSaldoDisponible() + monto <= cuenta.MAXIMO) {
			// Incrementa el saldo disponible
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
		} else {
			System.out.println("El deposito llevaria a la cuenta por encima del maximo permitido");
		}
		
		System.out.println("Origen: "+cuenta.getSaldoDisponible());

	}

	public void tranferir(CuentaBasica origen, CuentaBasica destino, double monto) {

		//              1500     -500   = 1000          
		if (origen.getSaldoDisponible() - monto < origen.MINIMO) { // true 1 false 0 true

			System.out.println("La operacion dejaria por debajo del minimo a la cuenta");

		} else if (destino.getSaldoDisponible() + monto > destino.MAXIMO) {
			System.out.println("La operacion dejaria por encima del maximo a la cuenta");
		}else {
			
			//Transferencia
			destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);			
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
			
		}
		
		System.out.println("Origen: "+origen.getSaldoDisponible());
		System.out.println("Origen: "+destino.getSaldoDisponible());

	}
	
	public void tranferir(CuentaPremium origen, CuentaPremium destino, double monto) {

		if (origen.getSaldoDisponible() - monto < origen.MINIMO) { // true 1 false 0 true

			System.out.println("La operacion dejaria por debajo del minimo a la cuenta");

		} else if (destino.getSaldoDisponible() + monto > destino.MAXIMO) {
			System.out.println("La operacion dejaria por encima del maximo a la cuenta");
		}else {
			
			//Transferencia
			destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);			
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
			
		}
		
		System.out.println("Origen: "+origen.getSaldoDisponible());
		System.out.println("Origen: "+destino.getSaldoDisponible());

	}

	public void consultarSaldoDisponible(CuentaBancaria cuenta) {
		System.out.println(cuenta.getSaldoDisponible());
	}

}
