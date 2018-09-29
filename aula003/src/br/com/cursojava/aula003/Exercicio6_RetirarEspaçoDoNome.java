package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio6_RetirarEspaçoDoNome {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um nome de usuario: ");
		String nome = teclado.nextLine();
		teclado.close();
		
		String texto = nome.trim().length() < 3 ? "Usuario invalido" : "Bem vindo "+nome.trim();
		
		System.out.println(texto);
	}

}
