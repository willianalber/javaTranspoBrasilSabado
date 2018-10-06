package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n1 = Integer.parseInt(teclado.nextLine());

		int n;
		do {
			System.out.print("Digite outro numero maior que o primeiro: ");
			n = Integer.parseInt(teclado.nextLine());
			if (n < n1) {
				System.out.println("Numero invalido!");
			}

		} while (n <= n1);

		for (; n1 <= n; n1++) {
			System.out.print(n1 + ", ");
		}
		teclado.close();

	}

}
