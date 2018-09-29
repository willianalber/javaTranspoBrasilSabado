package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio17_ContaCaracter {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome de usuario: ");
		String nome = leitor.nextLine();
		leitor.close();
		
		if (nome.length() < 3){
			System.out.println("O nome informado é invalido!!");
		}
		
		
	}

}
