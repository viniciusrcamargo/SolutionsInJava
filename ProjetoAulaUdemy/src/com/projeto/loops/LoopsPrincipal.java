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
			System.out.println("N�mero = " + numero);
			numero++;
		}
		
		
		do {
			System.out.println("Insira sua senha");
			password = scan.nextLine().trim();
			if(password.length() < 8) {
				System.out.println("A senha deve conter no m�nimo 8 caract�res");
			}
		}while(password.length() < 8);
		System.out.println("senha salva com sucesso!");
	    */
		
		for(numero = 0; numero < 6; numero++){
			System.out.println("Incremento do n�mero loop for n�mero = " + numero);
		}
	}

}
