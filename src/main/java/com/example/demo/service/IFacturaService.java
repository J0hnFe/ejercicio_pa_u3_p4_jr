package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Factura;
import com.example.demo.repo.modelo.Producto;
import com.example.demo.repo.modelo.DTO.ProductoDto;


public interface IFacturaService {
	
	public void agregar(List<Producto> list, String cedula);

}
