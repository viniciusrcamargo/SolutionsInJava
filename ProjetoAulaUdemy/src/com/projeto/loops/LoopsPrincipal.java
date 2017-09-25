package com.projeto.loops;

import java.io.Console;
import java.util.Scanner;

public class LoopsPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String password = "";
		int numero = 0;
		
		/*
		while(numero < 4) {
			System.out.println("Número = " + numero);
			numero++;
		}
		
		
		do {
			System.out.println("Insira sua senha");
			password = scan.nextLine().trim();
			if(password.length() < 8) {
				System.out.println("A senha deve conter no mínimo 8 caractéres");
			}
		}while(password.length() < 8);
		System.out.println("senha salva com sucesso!");
	    */
		
		for(numero = 0; numero < 6; numero++){
			System.out.println("Incremento do número loop for número = " + numero);
		}
	}

}
