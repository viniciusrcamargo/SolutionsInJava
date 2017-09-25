package com.projeto.metodos;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma palavra ou frase para saber a quantidade de caracteres ");
		String palavra = scan.nextLine().trim();
		System.out.println("quantidade de caracteres da palavra ou frase = " + tamanhoPalavra(palavra));
		

		numerosPar();
	}
	
	private static int tamanhoPalavra(String palavra) {
		return palavra.length();
	}
	
	private static void numerosPar() {
		System.out.print("Números pares de 0 até 100 ");
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				 System.out.print(" "+ i);	
			}
			
		}
	}

}
