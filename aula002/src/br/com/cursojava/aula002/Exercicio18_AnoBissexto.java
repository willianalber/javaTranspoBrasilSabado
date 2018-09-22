package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio18_AnoBissexto {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o ano em que você nasceu: ");
		int ano = Integer.parseInt(leitor.nextLine());
		
		if ((ano % 400 == 0)||((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println("É um ano Bissexto!");
		}
		else
		{
			System.out.println("Não é um ano bissexto!");
		}
		
		
	}

}
