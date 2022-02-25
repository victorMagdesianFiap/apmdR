package br.com.fiap.banco;

public class Conta {
	
	private String titular;
	private int numero;
	private double saldo;
	private double juros;
	
	public Conta(String titular) {
		setTitular(titular);
		numero = 1;
		saldo = 100;
		juros = 0.01;
	}
	
	
	public void setJuros(double juros) {
		if (juros >= 0 )
			this.juros = juros;
	}
	
	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getJuros() {
		return juros;
	}







}
