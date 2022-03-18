package br.com.fiap.rh;

public class Gerente extends Empregado implements FuncionarioAutenticado {

	private String area;
	private double bonus;
	private String senha;

	@Override
	public double calcularSalario() {
		return getSalarioBase() + bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
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
