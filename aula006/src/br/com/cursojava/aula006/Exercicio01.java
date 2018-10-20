package br.com.cursojava.aula006;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double[][] notas = new double[5][3];

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Digite a %d do %d aluno: ", (j + 1), (i + 1));
				notas[i][j] = Double.parseDouble(teclado.nextLine());
			}
		}
		for (double[] linha : notas) {
			System.out.print("| ");
			for (double notas1 : linha) {
				System.out.print(notas1 + " ");
			}
			System.out.println("| ");
		}
		teclado.close();

	}

}
