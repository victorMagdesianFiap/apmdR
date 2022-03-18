package br.com.fiap.rh;

public final class Presidente extends Empregado implements 
FuncionarioAutenticado {

	private double valorDasCotas;
	private String senha;
	
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

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

}
