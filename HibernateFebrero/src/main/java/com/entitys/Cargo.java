package com.entitys;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CARGOS")

public class Cargo{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cargo_id_auto")
	@SequenceGenerator(name="cargo_id_auto", sequenceName="CARGO_SEQ")
	@Column(name="CARGO_ID", columnDefinition="NUMBER")
	private int cargoId;
	
	@Column(name="DESCRIPCION", columnDefinition="NVARCHAR2(20)")
	private String descripcion;
	@Column(name="SUELDO", columnDefinition="NUMBER(5,2)")
	private double sueldo;
	
	
//	@OneToMany(mappedBy="cargo")
//	private List<Empleados> list;
	
	public Cargo() {
		
	}

	public int getCargoId() {
		return cargoId;
	}

	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
		
//	public List<Empleados> getList() {
//		return list;
//	}
//
//	public void setList(List<Empleados> list) {
//		this.list = list;
//	}

	@Override
	public String toString() {
		return "Cargo [cargoId=" + cargoId + ", descripcion=" + descripcion + ", sueldo=" + sueldo + "]";
	}

}
