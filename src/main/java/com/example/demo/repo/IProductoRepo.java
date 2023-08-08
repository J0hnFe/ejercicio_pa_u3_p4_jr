package com.example.demo.repo;

import java.math.BigDecimal;

import com.example.demo.repo.modelo.Factura;
import com.example.demo.repo.modelo.Producto;
import com.example.demo.repo.modelo.DTO.ProductoDto;

public interface IProductoRepo {
	
	public void insertar(Producto p);
	
	public ProductoDto buscar(BigDecimal precio);
	
}
