package br.com.cursojava.aula006;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double[][] notas = new double[5][3];
		double[] medias = new double[5];

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Digite a %d do %d aluno: ", (j + 1), (i + 1));
				notas[i][j] = Double.parseDouble(teclado.nextLine());
			}
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("| ");
			medias[i] = 0;
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
				medias[i] += notas[i][j];
			}
			System.out.print("| ");
			medias[i] = medias[i]/notas[i].length;
			System.out.printf("> Média = %.2f < \n",medias[i]);
			
		}
		teclado.close();

	}

}
