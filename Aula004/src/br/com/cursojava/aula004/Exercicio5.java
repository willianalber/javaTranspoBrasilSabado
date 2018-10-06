package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 0; i <= 50; i++)
		{
			soma += i;
		}
		System.out.println("Soma dos 50 primeiros numeros inteiros: "+ soma);
	}

}
