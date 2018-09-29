package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio8_PegarPrimeiraPalavra {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		
		String[] palavra = frase.split(" ");
		System.out.println(palavra[0]);
	}

}
