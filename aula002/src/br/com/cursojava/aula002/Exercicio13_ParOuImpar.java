package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio13_ParOuImpar {
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int numero = Integer.parseInt(teclado.nextLine());
		if ((numero%2)==0){
			System.out.println("Par");
		}
		else
			System.out.println("Impar");
		
		teclado.close();
		
	}

}
