package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[] nomes = new String[5];

		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("Digite a %dª nome: ", (i + 1));
			nomes[i] = teclado.nextLine();
		}
		teclado.close();
		for (int i = nomes.length; i > 0; i--) {
			System.out.print(nomes[i-1]+" ");
			
		}
	}

}
