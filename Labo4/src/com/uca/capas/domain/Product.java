package com.uca.capas.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {
	
	@Size(message="El campo debe tener un máximo de 30 caracteres", max=30)
	@NotEmpty(message="El campo no puede ser nulo")
	private String nombre;
	
	@Size(message="El campo debe tener un máximo de 30 caracteres", max=30)
	@NotEmpty(message="El campo no puede ser nulo")
	private String marca;
	
	@Size(message="El campo debe tener un máximo de 30 caracteres", max=30)
	@NotEmpty(message="El campo no puede ser nulo")
	private String descripcion;
	
	@Size(message="El campo debe tener un máximo de 30 caracteres", max=30)
	@NotEmpty(message="El campo no puede ser nulo")
	private String categoria;
	
	@Positive(message="El precio debe ser positivo")
	@NotNull
	private BigDecimal precio;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotNull
	private Date vencimiento;

	public Product() {}

	public Product(String nombre, String marca, String descripcion, String categoria, BigDecimal precio, Date vencimiento) {
			
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.vencimiento = vencimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	
	
	

}
