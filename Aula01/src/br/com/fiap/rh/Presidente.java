package br.com.fiap.rh;

public final class Presidente extends Empregado {

	private double valorDasCotas;
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + valorDasCotas;
	}

	public double getValorDasCotas() {
		return valorDasCotas;
	}

	public void setValorDasCotas(double valorDasCotas) {
		this.valorDasCotas = valorDasCotas;
	}

}
