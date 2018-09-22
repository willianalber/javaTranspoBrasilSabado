package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio11_MaiorIdade {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		if (idade >= 18){
			System.out.println("Você ja tem idade para fazer a CNH!");
		}
		else
		{
			System.out.println("Você ainda não tem idade para fazer a CNH!");
		}
		
	}

}
