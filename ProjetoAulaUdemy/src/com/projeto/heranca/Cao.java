package com.projeto.heranca;

public class Cao extends Animal {

	public void Latir() {
		System.out.println("C�o latindo");
	}
	
	public void Correr() {
		super.Correr();
		System.out.println("Pronto para correr c�o!");
	}
}
