package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		/*Ctrl+shift+o, para importa*/
		int a, b;
		float x, c;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		System.out.println("Digite o primeiro valor: ");
		x = scan.nextFloat();
		System.out.println("Digite o segundo valor: ");
		c = scan.nextFloat();
		
		/*selecione: soma e Ctrl+1 e escola: Assign statement to new local variable*/
		int soma = soma(a,b); 
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(x,c);
		
		System.out.println("soma " + soma);
		System.out.println("subtração " + subtracao);
		System.out.println("multiplicação " + multiplicacao);
		System.out.println("Divisão " + divisao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static float divisao(float x, float c) {
		return x / c;
	}
}
