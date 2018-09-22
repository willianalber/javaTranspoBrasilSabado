package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio5_AnoEmDias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		teclado.close();
		int dias = idade * 365;
		
		System.out.println("Sua idade em dias é: "+dias);
	}

}
