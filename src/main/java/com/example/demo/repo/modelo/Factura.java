package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
	
	@Id
	@SequenceGenerator(name = "seq_factura", sequenceName = "seq_factura", allocationSize = 1)
	@GeneratedValue(generator = "seq_factura", strategy = GenerationType.SEQUENCE)
	@Column(name = "fact_id")
	private Integer id;
	@Column(name = "fact_fecha")
	private LocalDate fecha;
	@Column(name = "fact_total_factura")
	private BigDecimal totalFactura;
	
	@OneToOne
	@JoinColumn(name = "fact_id_detalle_factura")
	private DetalleFactura detalleFactura;
	
	//toString
	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", totalFactura=" + totalFactura + "]";
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(BigDecimal totalFactura) {
		this.totalFactura = totalFactura;
	}

	public DetalleFactura getDetalleFactura() {
		return detalleFactura;
	}

	public void setDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFactura = detalleFactura;
	}

	public Integer getId() {
		return id;
	}
	
	
	

}
