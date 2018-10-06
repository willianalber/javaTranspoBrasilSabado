package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		teclado.close();


		for (int i = 0; i <= palavra.length(); i++) {

			System.out.println(palavra.substring(0, i));

		}

	}

}
