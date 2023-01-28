package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutoServiceImpl implements IAutoService{

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

	
}
