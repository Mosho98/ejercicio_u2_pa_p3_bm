package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Renta;
import com.example.demo.repository.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService{

	@Autowired
	private IRentaRepo iRentaRepo;

	@Override
	public void agregar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepo.insertar(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRentaRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepo.eliminar(id);
	}
}
