package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio12_ColocaFraseMetadeCaixaAltaEBaixa {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		
		int tamanho = (frase.trim().length())/2;
		System.out.println(frase.substring(0, tamanho).toLowerCase()+frase.substring(tamanho).toUpperCase());
		
		
	}

}
