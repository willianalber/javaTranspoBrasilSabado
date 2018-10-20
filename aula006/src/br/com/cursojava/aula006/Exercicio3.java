package br.com.cursojava.aula006;

public class Exercicio3 {

	public static void main(String[] args) {

		int[][] matriz = { { 10, 9, 8, 7 }, { 6, 5, 4, 3 }, { 2, 1, 2, 3 }, { 4, 5, 6, 7 } };
		int[][] matrizMultiplicada = new int[matriz.length][4];

		int somaTotal = 0;

		for (int[] linha : matriz) {
			for (int valor : linha) {
				somaTotal += valor;
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("   ");

				System.out.print(matriz[i][j]);

			}
			System.out.println("");
		}

		System.out.println("Soma de todos os valores: " + somaTotal);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("   ");
				if (i == j) {
					System.out.print(matriz[i][j]);

					for (int k = 0; k < matriz.length; k++) {
						matrizMultiplicada[i][k] = matriz[i][k] * matriz[i][j];

					}

				}
			}
			System.out.println("");
		}

		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][matriz[i].length - i - 1]);
			System.out.println("");
		}

		for (int i = 0; i < matrizMultiplicada.length; i++) {
			for (int j = 0; j < matrizMultiplicada[i].length; j++) {
				System.out.print("   ");

				System.out.print(matrizMultiplicada[i][j]);

			}
			System.out.println("");
		}
	}

}
