package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double[] produto = new double[10];

		for (int i = 0; i < produto.length; i++) {
			System.out.printf("Digite o valor do %dº produto: ", (i + 1));
			produto[i] = Double.parseDouble(teclado.nextLine());
		}

		teclado.close();

		for (int i = 0; i < produto.length; i++) {
			double desconto = produto[i] - (produto[i] * 0.1);
			System.out.printf("%dº produto sem desconto R$ %.2f com desconto de 10%% R$ %.2f \n", (i + 1), produto[i],
					desconto);

		}

	}

}
