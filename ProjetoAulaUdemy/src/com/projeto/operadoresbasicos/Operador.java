package com.projeto.operadoresbasicos;

public class Operador {

	public static void main(String[] args) {
		
		int first = 10;
		int second = 2;
		
		int resultado = 0;
		int resultado2 = 0;
		int resultado3 = 0;
		int resultado4 = 0;
		int resultado5 = 0;
		
		resultado = first + second;
		resultado2 = first - second;
		resultado3 = first * second;
		resultado4 = first / second;
		resultado5 = first % second;
		
		System.out.println("resultado da soma de " + first + " com " + second + " = " + resultado);
		System.out.println("resultado da subtração de " + first + " com " + second + " = " + resultado2);
		System.out.println("resultado da multiplicação de " + first + " com " + second + " = " + resultado3);
		System.out.println("resultado da divisão de " + first + " com " + second + " = " + resultado4);
		System.out.println("resultado do resto da divisão de " + first + " com " + second + " = " + resultado5);
		

	}

}
