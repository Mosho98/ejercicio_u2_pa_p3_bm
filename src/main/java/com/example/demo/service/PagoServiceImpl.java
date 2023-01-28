package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Pago;
import com.example.demo.repository.IPagoRepo;

@Service
public class PagoServiceImpl implements IPagoService{

	@Autowired
	private IPagoRepo iPagoRepo;
	
	@Override
	public void agregar(Pago pago) {
		// TODO Auto-generated method stub
		
	}

	
}
