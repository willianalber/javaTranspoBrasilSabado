package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n;
		do {
			System.out.print("Digite um numero entre 1 e 20: ");
			n = Integer.parseInt(teclado.nextLine());
			if (n > 20 || n < 1) {
				System.out.println("Numero invalido!");
			}

		} while (n > 20 || n < 1);
		long resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i; 			
		}
		System.out.println(resultado);
		teclado.close();

	}

}
