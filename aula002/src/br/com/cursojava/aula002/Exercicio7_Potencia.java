package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio7_Potencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		System.out.println("Potencia de 2: "+Math.pow(numero, 2));
	}

}
