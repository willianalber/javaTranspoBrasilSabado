package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio16_MenuBanco {
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Depositar \n2 - Sacar \n3 - Verificar Saldo ");
		int opcao = Integer.parseInt(teclado.nextLine());
		
		teclado.close();

		if (opcao == 1){
			System.out.println("Você escolheu a opção 1 de depositar!");
		}
		else if (opcao == 2){
			System.out.println("Você escolheu a opção 2 de sacar!");
		}
		else if (opcao == 3){
			System.out.println("Você escolheu a opção 3 de verificar saldo!");
		}
		
	}

}
