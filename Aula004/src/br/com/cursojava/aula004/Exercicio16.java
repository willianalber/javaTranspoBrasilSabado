package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double[] notas = new double[10];
		String[] nomes = new String[10];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite o nome do %dº aluno: ",(i+1));
			nomes[i] = teclado.nextLine();
			System.out.printf("Digite a nota: ");
			notas[i] = Double.parseDouble(teclado.nextLine());
		}

		double media = 0;
		teclado.close();
		for (double atual : notas) {
			media += atual;
		}
		media /= notas.length;
		System.out.println("Média geral: " + media);
		for (int i = 0; i <= notas.length;  i++) {

			if (notas[i] >= media) {
				System.out.println("Aluno "+nomes[i]+" \nMedia: "+notas[i]);
			}
		}
	}

}
