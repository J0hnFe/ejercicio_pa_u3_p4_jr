package com.example.demo.repo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto", allocationSize = 1)
	@GeneratedValue(generator = "seq_producto", strategy = GenerationType.SEQUENCE)
	@Column(name = "cta_id")
	private Integer id;
	
	@Column(name = "prod_cod_barras")
	private String codBarras;
	
	@Column(name = "prod_nombre")
	private String nombre;
	
	@Column(name = "prod_categoria")
	private String categoria;
	
	@Column(name = "prod_stock")
	private Integer stock;
	
	@Column(name = "prod_precio")
	private BigDecimal precio;
	
	@ManyToOne
	@JoinColumn(name = "prod_id_detalle_factura")
	private DetalleFactura detalleFactura;


	public String getCodBarras() {
		return codBarras;
	}


	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public Integer getStock() {
		return stock;
	}



	public void setStock(Integer stock) {
		this.stock = stock;
	}



	public BigDecimal getPrecio() {
		return precio;
	}



	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
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



	//toString
	@Override
	public String toString() {
		return "Producto [id=" + id + ", codBarras=" + codBarras + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", stock=" + stock + ", precio=" + precio + "]";
	}
	
	

}
