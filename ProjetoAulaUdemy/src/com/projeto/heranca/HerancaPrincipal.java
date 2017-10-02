package com.projeto.heranca;

public class HerancaPrincipal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cao cao = new Cao();
		Passaro passaro = new Passaro();
		
		animal.Correr();
		cao.Correr();
		
		cao.setTamanho("Grande");
		cao.setPeso(30.0);
		cao.setCor("Marrom");
		
		passaro.setTamanho("Grande");
		passaro.setPeso(20.0);
		passaro.setCor("preta e branca");
		
		System.out.println("Tamanho do cão " + cao.getTamanho());
		System.out.println("Peso do cão " + cao.getPeso() + " kg");
		System.out.println("Cor do cão " + cao.getCor());
		cao.Latir();
		cao.Correr();
		
		System.out.println();
		System.out.println("Tamanho do passaro " + passaro.getTamanho());
		System.out.println("Peso do passaro " + passaro.getPeso() + " kg");
		System.out.println("Cor do pássaro " + passaro.getCor());
		passaro.Voar();
		
	}

}
