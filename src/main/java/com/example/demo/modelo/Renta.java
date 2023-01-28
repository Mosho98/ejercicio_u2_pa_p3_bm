package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "renta")
@Entity
public class Renta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "renta_seq")
	@SequenceGenerator(name = "renta_seq", sequenceName = "renta_seq", allocationSize = 1)
	@Column(name = "renta_id")
	private Integer id;
	
	@Column(name = "renta_fecha")
	private LocalDateTime fechaRenta;
	
	@Column(name = "renta_numero_dias")
	private Integer diasRenta;
	
	@Column(name = "renta_valor")
	private BigDecimal valor;
	
	//@OneToOne(mappedBy = "renta", cascade = CascadeType.ALL)	
	
	@ManyToOne
	@JoinColumn(name = "renta_id_automovil")
	private Automovil auto;
	


	public void setAuto(Automovil auto) {
		this.auto = auto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaRenta() {
		return fechaRenta;
	}

	public void setFechaRenta(LocalDateTime fechaRenta) {
		this.fechaRenta = fechaRenta;
	}

	public Integer getDiasRenta() {
		return diasRenta;
	}

	public void setDiasRenta(Integer diasRenta) {
		this.diasRenta = diasRenta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	

	public Automovil getAuto() {
		return auto;
	}
	

	
}
