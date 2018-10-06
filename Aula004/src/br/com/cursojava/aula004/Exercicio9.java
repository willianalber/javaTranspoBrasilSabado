package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] notas = new int[5];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			notas[i] = Integer.parseInt(teclado.nextLine());
		}
		teclado.close();
		for (int atual : notas) {
			System.out.println(atual);
		}
	}

}
