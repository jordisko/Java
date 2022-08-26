package com.main;

public class Coche {
	private String marca;
	private String modelo;
	private String fechaDeConstruccion;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFechaDeConstruccion() {
		return fechaDeConstruccion;
	}
	public void setFechaDeConstruccion(String fechaDeConstruccion) {
		this.fechaDeConstruccion = fechaDeConstruccion;
	}
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", fechaDeConstruccion=" + fechaDeConstruccion + "]";
	}
	public Coche(String marca, String modelo, String fechaDeConstruccion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.fechaDeConstruccion = fechaDeConstruccion;
	}
	public Coche() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}