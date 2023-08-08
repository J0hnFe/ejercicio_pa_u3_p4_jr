package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Producto;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioPaU3P4JrApplication implements CommandLineRunner{
	
	@Autowired
	private IProductoService productoService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4JrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Producto p1 = new Producto();
		p1.setNombre("Pastilla amarilla");
		p1.setPrecio(new BigDecimal(10));
		p1.setCategoria("Medicina");
		p1.setCodBarras("AAAA");
		p1.setStock(100);
		
		this.productoService.agregar(p1);
		
	}

}
