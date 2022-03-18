package br.com.fiap.rh;

public class Cliente implements FuncionarioAutenticado {

	private String senha;
	
	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

}
