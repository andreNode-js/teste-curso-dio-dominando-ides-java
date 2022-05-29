package br.com.dio;

import br.com.dio.calculadora.calculadora;
import br.com.dio.model.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();
		calculadora calc = new calculadora();

		System.out.println(gato);
		System.out.println(livros);
		System.out.println(calc);
		
		
		int a = 2;
		int b = 3;
		System.out.println("Hello world! " + (a + b));

	}

}

class Livros {
	private String nome;
	private String npag;
}
