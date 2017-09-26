package com.projeto.conta;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.depositar(200);
		System.out.println("Saldo atual = R$ " + conta.getSaldo());
		conta.sacar(150);
		System.out.println("Saldo atual = R$ " + conta.getSaldo());

	}

}
