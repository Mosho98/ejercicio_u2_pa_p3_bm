package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "cliente")
@Entity
public class Cliente {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")
	//@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name = "clien_cedula")
	private String cedula;
	
	@Column(name = "clien_nombre")
	private String nombre;
	

	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<Renta> rentas;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}
	
	
	

	
}
