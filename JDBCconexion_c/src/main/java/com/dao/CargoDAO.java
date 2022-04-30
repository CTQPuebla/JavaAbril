package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.CargoDTO;
import com.entitys.Cargo;
import com.entitys.Empleado;
import com.general.Database;
import com.general.Metodos;

public class CargoDAO implements Metodos {

	Connection con = null;
	PreparedStatement pst = null;

	Database db = new Database();
	ResultSet rs = null;
	Cargo c = null;
	CargoDTO cdto = null;
	String resultado = null;

	@Override
	public String guardar(Object ob) {
		Cargo c = (Cargo) ob;

		String query = "INSERT INTO CARGOS VALUES(?,?,?)";
		try {

			// Se abre la conexion a db usando los datos y credenciales
			// configurados en la clase Database
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			// Seteo de valores en el orden correcto
			pst.setInt(1, c.getCargoId());
			pst.setString(2, c.getDescripcion());
			pst.setDouble(3, c.getSueldo());

			// Ejecucion de la sentencia
			int flag = pst.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Se ha guardado un nuevo cargo");
			} else {
				resultado = "0";
				System.out.println("Error");
			}

		} catch (Exception ex) {
			resultado = ex.getMessage();
		}
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		Cargo c = (Cargo) ob;

		String query = "UPDATE CARGOS SET DESCRIPCION = ?, SUELDO=? WHERE CARGO_ID = ?";

		try {

			// Se abre la conexion a db usando los datos y credenciales
			// configurados en la clase Database
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			// Seteo de valores en el orden correcto
			pst.setDouble(1, c.getSueldo());
			pst.setInt(2, c.getCargoId());
			pst.setString(3, c.getDescripcion());

			// Ejecucion de la sentencia
			int flag = pst.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Se ha actualizado el empleado");
			} else {
				resultado = "0";
				System.out.println("Error");
			}

		} catch (Exception ex) {
			resultado = ex.getMessage();
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {

		String query = "DELETE FROM CARGOS WHERE CARGO_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = con.prepareStatement(query);

			int flag = pst.executeUpdate();

			if (flag > 0) {
				System.out.println("Cargo eliminado");
				resultado = "1";
			} else {
				System.out.println("No se pudo eliminar");
				resultado = "0";
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			System.out.println("Hubo un error al eliminar");
		}

		return resultado;
	}

	@Override
	public Object buscar(int id) {
		String query = "SELECT * FROM CARGOS WHERE CARGO_ID =" + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			rs = pst.executeQuery();

			while (rs.next()) {
				c = new Cargo(rs.getInt("CARGO_ID"), rs.getString("DESCRIPCION"), rs.getDouble("SUELDO"));

			}
		} catch (Exception ex) {
			System.out.println("Error al obtener el registro: " + ex.getMessage());
		}
		return c;
	}

	@Override
	public List mostrar() {
		List<Cargo> list = new ArrayList<Cargo>();

		String query = "SELECT CARGO_ID, DESCRIPCION, SUELDO FROM CARGOS";

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			rs = pst.executeQuery();

			while (rs.next()) {
				c = new Cargo(rs.getInt("CARGO_ID"), rs.getString("DESCRIPCION"), rs.getDouble("SUELDO"));
				// añado el objeto de empleado con la informacion
				list.add(c);
			}
		} catch (Exception ex) {
			System.out.println("Error al listar los elementos: " + ex.getMessage());
		}
		return list;
	}

	public CargoDTO empleadosPorCargo(int id) {
		String query = "SELECT C.DESCRIPCION, E.* FROM EMPLEADO E INNER JOIN CARGOS C ON E.CARGO_ID = C.CARGO_ID"
				+ " WHERE C.CARGO_ID="+ id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			List<Empleado> list = new ArrayList<Empleado>();
			String descripcion = "";
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt("EMPLEADO_ID"), rs.getString("NOMBRE"), rs.getInt("ANTIGUEDAD"),
						rs.getString("SEXO"), rs.getString("ESTADO_CIVIL"), rs.getDate("FECHA_NAC"),
						rs.getInt("CARGO_ID"));

				list.add(e);
				descripcion = rs.getString("DESCRIPCION");
			}
			cdto = new CargoDTO(descripcion, list);
		} catch (Exception ex) {
			System.out.println("Error al listar los elementos: " + ex.getMessage());
		}
		return cdto;
	} 
	
}
