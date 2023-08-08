package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.DetalleFactura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(DetalleFactura df) {
		this.entityManager.persist(df);
	}
}
