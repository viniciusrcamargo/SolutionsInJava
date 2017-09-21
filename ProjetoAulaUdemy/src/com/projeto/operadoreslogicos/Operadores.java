package com.projeto.operadoreslogicos;

public class Operadores {

	public static void main(String[] args) {
		
		boolean resultado;
		boolean resultado2;
		boolean resultado3;
		boolean resultado4;
		boolean resultado5;
		boolean resultado6;
		boolean resultado7;
		boolean resultado8;
		boolean resultado9;
		int num1 = 5;
		int num2 = 7;
		
		resultado = num1 == num2;
		resultado2 = num1 != num2;
		resultado3 = num1 > num2;
		resultado4 = num1 < num2;
		resultado5 = num1 >= num2;
		resultado6 = num1 <= num2;
		resultado7 = true && true;
		resultado8 = true && false;
		resultado9 = true || false;
		
		System.out.println("Resultado de comparação de " + num1 + " == " + num2 + " = " + resultado);
		System.out.println("Resultado de comparação de " + num1 + " != " + num2 + " = " + resultado2);
		System.out.println("Resultado de comparação de " + num1 + " > " + num2 + " = " + resultado3);
		System.out.println("Resultado de comparação de " + num1 + " < " + num2 + " = " + resultado4);
		System.out.println("Resultado de comparação de " + num1 + " >= " + num2 + " = " + resultado5);
		System.out.println("Resultado de comparação de " + num1 + " <= " + num2 + " = " + resultado6);
		System.out.println("Resultado de comparação de " + true + " && " + true + " = " + resultado7);
		System.out.println("Resultado de comparação de " + true + " && " + false + " = " + resultado8);
		System.out.println("Resultado de comparação de " + true + " || " + false + " = " + resultado9);
	}

}
