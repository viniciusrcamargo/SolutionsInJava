package com.projeto.conta;

public class Conta {
	private int idCliente;
	private String nomeCliente;
	private double saldo = 100;
	
	public void depositar(double valorDepositar) {
		this.saldo += valorDepositar;
	}
	
	public void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
