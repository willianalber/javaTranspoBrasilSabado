package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double[] notas = new double[10];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			notas[i] = Double.parseDouble(teclado.nextLine());
		}

		double media = 0;
		teclado.close();
		for (double atual : notas) {
			media += atual;
		}
		media /= notas.length;
		System.out.println("Média: " + media);
		for (double atual : notas) {

			if (atual >= media) {
				System.out.println(atual);
			}
		}
	}

}
