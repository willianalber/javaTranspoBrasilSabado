package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int[] notas = new int[10];

		int maior, menor;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			notas[i] = Integer.parseInt(teclado.nextLine());
		}
		maior = notas[0];
		menor = maior;
		teclado.close();
		for (int atual : notas) {
			System.out.println(atual);
			if (maior >= atual) {
				maior = atual;
			}
			if (menor <= atual) {
				menor = atual;
			}
		}

		System.out.printf("Nota maior: %d \nNota menor: %d", maior, menor);

	}

}
