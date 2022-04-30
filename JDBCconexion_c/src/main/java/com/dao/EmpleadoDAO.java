package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.EmpleadoDTO;
import com.entitys.Empleado;
import com.general.Database;
import com.general.Metodos;

public class EmpleadoDAO implements Metodos {

	Connection con = null;
	PreparedStatement pst = null;

	Database db = new Database();
	ResultSet rs = null;
	Empleado e = null;
	EmpleadoDTO edto = null;

	String resultado = null;

	@Override
	public String guardar(Object ob) {

		// Casteo a un tipo especifico
		Empleado e = (Empleado) ob;

		String query = "INSERT INTO EMPLEADO VALUES(?,?,?,?,?,?,?)";

		try {

			// Se abre la conexion a db usando los datos y credenciales
			// configurados en la clase Database
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			// Seteo de valores en el orden correcto
			pst.setInt(1, e.getEmpleadoId());
			pst.setString(2, e.getNombre());
			pst.setInt(3, e.getAntiguedad());
			pst.setString(4, e.getSexo());
			pst.setString(5, e.getEstadoCivil());
			pst.setDate(6, e.getFechaNac());
			pst.setInt(7, e.getCargoId());

			// Ejecucion de la sentencia
			int flag = pst.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Se ha guardado un nuevo empleado");
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

		// Casteo a un tipo especifico
		Empleado e = (Empleado) ob;

		String query = "UPDATE EMPLEADO SET NOMBRE=?, ANTIGUEDAD = ?, SEXO = ?, ESTADO_CIVIL = ?,"
				+ "FECHA_NAC = ?, CARGO_ID = ? WHERE EMPLEADO_ID = ?";

		try {

			// Se abre la conexion a db usando los datos y credenciales
			// configurados en la clase Database
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			// Seteo de valores en el orden correcto
			pst.setString(1, e.getNombre());
			pst.setInt(2, e.getAntiguedad());
			pst.setString(3, e.getSexo());
			pst.setString(4, e.getEstadoCivil());
			pst.setDate(5, e.getFechaNac());
			pst.setInt(6, e.getCargoId());
			pst.setInt(7, e.getEmpleadoId());

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

		String query = "DELETE FROM EMPLEADO WHERE EMPLEADO_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = con.prepareStatement(query);

			int flag = pst.executeUpdate();

			if (flag > 0) {
				System.out.println("Empleado eliminado");
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
		String query = "SELECT * FROM EMPLEADO WHERE EMPLEADO_ID =" + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			rs = pst.executeQuery();

			while (rs.next()) {
				e = new Empleado(rs.getInt("EMPLEADO_ID"), rs.getString("NOMBRE"), rs.getInt("ANTIGUEDAD"),
						rs.getString("SEXO"), rs.getString("ESTADO_CIVIL"), rs.getDate("FECHA_NAC"),
						rs.getInt("CARGO_ID"));

			}
		} catch (Exception ex) {
			System.out.println("Error al obtener el registro: " + ex.getMessage());
		}
		return e;
	}

	@Override
	public List mostrar() {
		List<Empleado> list = new ArrayList<Empleado>();

		String query = "SELECT * FROM EMPLEADO";

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = con.prepareStatement(query);

			rs = pst.executeQuery();

			while (rs.next()) {
				e = new Empleado(rs.getInt("EMPLEADO_ID"), rs.getString("NOMBRE"), rs.getInt("ANTIGUEDAD"),
						rs.getString("SEXO"), rs.getString("ESTADO_CIVIL"), rs.getDate("FECHA_NAC"),
						rs.getInt("CARGO_ID"));

				// añado el objeto de empleado con la informacion
				list.add(e);
			}
		} catch (Exception ex) {
			System.out.println("Error al listar los elementos: " + ex.getMessage());
		}
		return list;
	}

	public EmpleadoDTO mostrarEmpleadoCargo(int id) {
		String query = "SELECT E.NOMBRE, E.ANTIGUEDAD, E.SEXO, E.ESTADO_CIVIL, E.FECHA_NAC, C.DESCRIPCION, C.SUELDO"
				+ "FROM EMPLEADO E INNER JOIN CARGOS C ON E.CARGO_ID = C.CARGO_ID WHERE E.EMPLEADO_ID = " + id;
		try {
			// Abrir la conexion a db
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			// Precompila la sentencia SQL
			pst = con.prepareStatement(query);
			// Ejecuta la instruccion SQL
			rs = pst.executeQuery();
			// Captura los resultados
			while (rs.next()) {
				
				edto = new EmpleadoDTO(rs.getString("NOMBRE"), rs.getInt("ANTIGUEDAD"), rs.getString("DESCRIPCION"));
			}
			System.out.println(edto);
		} catch (Exception ex) {
			System.out.println("Error al obtener el registro: " + ex.getMessage());
		}
		return edto;
	}

}
