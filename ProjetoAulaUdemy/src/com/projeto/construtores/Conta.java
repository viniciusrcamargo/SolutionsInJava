package com.projeto.construtores;

public class Conta {

	private int numConta;
	private double saldo;
	
	public Conta(int numConta) {
		System.out.println("Construtor chamado");
		System.out.println("Número da conta" + numConta);
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
