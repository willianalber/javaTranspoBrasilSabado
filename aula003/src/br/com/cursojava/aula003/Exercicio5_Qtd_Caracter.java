package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio5_Qtd_Caracter {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		String nome = teclado.nextLine();
		teclado.close();
		System.out.println(nome.length());

	}

}
