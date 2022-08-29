package com.main;

public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Persona{
	private String nombres;
	private String apellidos;
	private String documento;
	private String tipo;
}
class Cliente extends Persona{
	private String categoria;
	private String codigo;
	public void generarCodigo() {
		System.out.println("Codigo generado");
		
	}
}
class Empleado extends Persona{
	private String tipoContrato;
	private int sueldo;
	public void calcularSueldo() {
		System.out.println("Sueldo calculado");
	}
}