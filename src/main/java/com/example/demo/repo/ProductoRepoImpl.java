package com.example.demo.repo;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Producto;
import com.example.demo.repo.modelo.DTO.ProductoDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto p) {
		this.entityManager.persist(p);
	}

	@Override
	public ProductoDto buscar(BigDecimal precio) {
		String jpql = "SELECT p FROM ProductoDto p WHERE p.precio = :datoPrecio";
		
		TypedQuery<ProductoDto> query = this.entityManager.createQuery(jpql, ProductoDto.class);
		query.setParameter("datoPrecio", precio);
		return query.getSingleResult();
		
	}
	
	

}
