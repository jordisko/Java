package com.main;

public class Tarjeta {
	private String entidadEmisora;
	private String numero;
	private String titular;
	private String fechaCaducidad;
	private boolean estado=false;
	private int saldo=1000;
	
	//METODOS
	public boolean activar() {
		estado=true;
		return estado;
	}
	public void pagar(int cantidad) {
		if (cantidad<= saldo & estado==true) {
			saldo -=cantidad;
			System.out.println("El pago se ha efectuado tu saldo actual es de: "+ saldo);
		
		}
		else if(cantidad>=saldo) {
			System.out.println("La cantidad de pago supera tu saldo actual");
		}
		else 
			System.out.println("Tu tarjeta esta anulada");
	}
	public void verSaldo() {
		System.out.println(saldo);
	}
	public boolean anularTarjeta(){
		final boolean estado=false;
		return estado;
		
	}
	public Tarjeta(String entidadEmisora, String numero, String titular, 
			String fechaCaducidad) {
		this.entidadEmisora = entidadEmisora;
		this.numero = numero;
		this.titular = titular;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public Tarjeta(String entidadEmisora, String numero, String titular, 
			String fechaCaducidad, int saldo) {
		this.entidadEmisora = entidadEmisora;
		this.numero = numero;
		this.titular = titular;
		this.fechaCaducidad = fechaCaducidad;
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Tarjeta [entidadEmisora=" + entidadEmisora + ", numero=" + numero + ", titular=" + titular
				+ ", fechaCaducidad=" + fechaCaducidad + ", estado=" + estado + ", saldo=" + saldo + "]";
	}
	

}
