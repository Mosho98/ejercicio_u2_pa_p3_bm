package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "automovil")
@Entity
public class Automovil {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")
	//@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_valor_dia")
	private BigDecimal valorDia;
	
	@OneToMany(mappedBy = "automovil", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Renta> rentas;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValorDia() {
		return valorDia;
	}

	public void setValorDia(BigDecimal valorDia) {
		this.valorDia = valorDia;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

	
	
	
	
	
}
