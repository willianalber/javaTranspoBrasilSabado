package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio10_VerificaPalavraContemLetra {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		teclado.close();
		
		String resposta = palavra.contains("l") ? "A palavra informada poissui a letra 'l'" : palavra.contains("L") ? "A palavra informada poissui a letra 'L'" : "Não contem l ou L";
		
		System.out.printf(resposta);
		
	}

}
