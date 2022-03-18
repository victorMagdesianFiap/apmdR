package br.com.fiap.rh;

public interface FuncionarioAutenticado  {
	
	public abstract boolean autenticar(String senha);
	
	public abstract void setSenha(String senha);
	
}
