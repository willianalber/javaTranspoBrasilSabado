package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma palavra");

		String palavra = teclado.nextLine();

		int contador = palavra.length();

		String inverso = "";

		do {
			inverso += palavra.charAt(contador - 1);
			contador--;

		} while (contador != 0);

		System.out.println(inverso);

		teclado.close();

	}

}
