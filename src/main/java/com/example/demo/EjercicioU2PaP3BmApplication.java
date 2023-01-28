package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Renta;
import com.example.demo.service.IAutoService;
import com.example.demo.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3BmApplication.class, args);
	}
	@Autowired
	private IAutoService iAutoService;
	
	@Autowired
	private IRentaService iRentaService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Automovil mazda = new Automovil();
		Automovil chevrolet = new Automovil();
		Renta renta1 = new Renta();
		Renta renta2 = new Renta();
		
		
		List<Automovil> autos = new ArrayList<>();
		autos.add(chevrolet);
		autos.add(mazda);
		
		List<Renta> rentas = new ArrayList<>();
		rentas.add(renta1);
		rentas.add(renta2);
		
		Automovil auto = new Automovil();
		auto.setPlaca("LBB7250");
		auto.setValorDia(new BigDecimal(25));			
		auto.setRentas(rentas);
		
		Renta renta = new Renta();
		renta.setAuto(auto);
	
		this.iAutoService.agregar(auto);
	}

}
