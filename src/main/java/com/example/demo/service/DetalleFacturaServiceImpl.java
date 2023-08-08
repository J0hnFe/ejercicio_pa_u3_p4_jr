package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IDetalleFacturaRepo;
import com.example.demo.repo.modelo.DetalleFactura;

@Service
public class DetalleFacturaServiceImpl implements IDetalleFacturaService{

	@Autowired
	private IDetalleFacturaRepo detalleFacturaRepo;
	
	@Override
	public void agregar(DetalleFactura df) {
		
		
		
		this.detalleFacturaRepo.insertar(df);
	}
	

	

}
