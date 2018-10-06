package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[] nomes = new String[10];

		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("Digite a %dª nome: ", (i + 1));
			nomes[i] = teclado.nextLine();
		}
		teclado.close();
		String nomeMaior = nomes[0];
		int menorTamanho = nomes[0].length();
		for (String atual : nomes) {
			if (atual.length() >= menorTamanho){
				menorTamanho = atual.length();
				nomeMaior = atual;
			}			
		}
		System.out.println("Maior nome: "+nomeMaior);
	}

}
