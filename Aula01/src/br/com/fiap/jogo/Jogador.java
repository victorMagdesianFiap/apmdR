package br.com.fiap.jogo;

import javax.swing.JOptionPane;

public abstract class Jogador extends Object{
	
	private static final double GRAVIDADE = 1;
	private String classe = "Mago";
	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	public Jogador() {  //assinatura do método
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
		classe = "Guerreiro";
	}
	
	
	
	//sobrecarga de método
	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}
	
	public abstract void mover();
	
	public static void mostrarTempo() {
		System.out.println("Tempo 1:00");
	}
	
	public int getXp() {
		return this.xp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public boolean isEnvenenado() {
		return this.envenenado;
	}
	
	public void receberDano(int pontos) {
		//this.hp = this.hp - pontos;
		this.hp -= pontos;
		
		if (this.hp <= 0) {
			JOptionPane.showMessageDialog(null, "GAME OVER");
		}
	}
	
	public void receberCura(int pontos) {
		//this.hp = this.hp + pontos;
		this.hp += pontos;
	}

	public String getNome() {
		return nome;
	}
	
	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}
	
	public void receceberAntidoto() {
		envenenado = !envenenado;	
	}
	
	//herança -> sobrescrita de método 
	@Override
	public String toString() {
		String estatistica = getNome();
		estatistica += "\nXP = " + getXp();
		estatistica += "\nHP = " + getHp();
		
		if (isEnvenenado()) {
			estatistica += "\nestá envenenado";
		}else {
			estatistica += "\nnão está envenenado";
		}
		
		return estatistica;
	}
	
	
	public String getEstatistica() {
		String estatistica = getNome();
		estatistica += "\nXP = " + getXp();
		estatistica += "\nHP = " + getHp();
		
		if (isEnvenenado()) {
			estatistica += "\nestá envenenado";
		}else {
			estatistica += "\nnão está envenenado";
		}
		
		return estatistica;
		
	}
	

}
