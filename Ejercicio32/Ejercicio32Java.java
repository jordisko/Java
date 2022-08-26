package com.main;

public class Ejercicio32Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Coche c1 = new Coche();
	c1.setMarca("Renault");
	c1.setModelo("Clio");
	c1.setFechaDeConstruccion("2015");
	c1.getMarca();
	c1.getModelo();
	c1.getFechaDeConstruccion();
	System.out.println(c1.toString());
	Coche c2 = new Coche();
	c2.setMarca("Ferrari");
	c2.setModelo("Toscana");
	c2.setFechaDeConstruccion("2019");
	c2.getMarca();
	c2.getModelo();
	c2.getFechaDeConstruccion();
	System.out.println(c2.toString());
	Coche c3 = new Coche();
	c3.setMarca("Ford");
	c3.setModelo("Fiesta");
	c3.setFechaDeConstruccion("2018");
	c3.getMarca();
	c3.getModelo();
	c3.getFechaDeConstruccion();
	System.out.println(c3.toString());
	Coche c4 = new Coche ("Lamborginni","Huracan","2021");
	System.out.println(c4.toString());
	}
}
