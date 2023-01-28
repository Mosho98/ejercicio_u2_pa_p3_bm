package com.example.demo.service;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Renta;

public interface IRentaService {

	public void agregar(Renta renta);
	public Renta buscar(Integer id);
	public void eliminar(Integer id);
}
