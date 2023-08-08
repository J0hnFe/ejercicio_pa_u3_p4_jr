package com.example.demo.service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repo.IFacturaRepo;
import com.example.demo.repo.modelo.DetalleFactura;
import com.example.demo.repo.modelo.Factura;
import com.example.demo.repo.modelo.Producto;
import com.example.demo.repo.modelo.DTO.ProductoDto;

public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;


	@Override
	public void agregar(List<Producto> list, String cedula) {
		
		BigDecimal valorTotal = new BigDecimal(0);
		Factura factura = new Factura();
		DetalleFactura detalleFactura = new DetalleFactura();
		
		detalleFactura.setProductos(list);
		detalleFactura.setCantidad(list.size());
		detalleFactura.setPrecioUnitario(list.get(0).getPrecio());
		detalleFactura.setProductos(list);
	
		for(int i = 0; i <= list.size(); i++) {
			
			 valorTotal.add(list.get(i).getPrecio());
		}
		
		detalleFactura.setSubtotal(valorTotal);		
		factura.setDetalleFactura(detalleFactura);
		
	}

}
