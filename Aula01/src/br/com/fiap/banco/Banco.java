package br.com.fiap.banco;


public class Banco {
		
	public static void main(String[] args) {

		Conta conta = new Conta("Joao Carlos"); 
		System.out.println(conta.getTitular());
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		System.out.println(conta.getJuros());

		Conta conta2 = new Conta();

	}

}
