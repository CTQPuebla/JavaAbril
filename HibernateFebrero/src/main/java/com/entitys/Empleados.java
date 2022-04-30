package com.entitys;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="EMPLEADO")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
//property="@empleadoId", scope = Empleados.class)
public class Empleados {

	public Empleados() {	}
	public Empleados(int id) {
		this.empleadoId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="EMPLEADO_SEQ")
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="ANTIGUEDAD", columnDefinition="NUMBER")
	private int antiguedad;
	@Column(name="SEXO", columnDefinition="CHAR(1)")
	private String sexo;
	@Column(name="ESTADO_CIVIL", columnDefinition="NVARCHAR2(10)")
	private String estadoCivil;
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	private Date fechaNac;
	
//	@ManyToOne
//	@JoinColumn(name="CARGO_ID", columnDefinition="NUMBER")
//	private Cargo cargo;
	
	
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
//	public Cargo getCargo() {
//		return cargo;
//	}
//	public void setCargo(Cargo cargo) {
//		this.cargo = cargo;
//	}
	@Override
	public String toString() {
		return "Empleados [empleadoId=" + empleadoId + ", nombre=" + nombre + ", antiguedad=" + antiguedad + ", sexo="
				+ sexo + ", estadoCivil=" + estadoCivil + ", fechaNac=" + fechaNac + "]";
	}
	
}