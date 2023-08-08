package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Factura f) {
		
		
		
		this.entityManager.persist(f);
	}

}
