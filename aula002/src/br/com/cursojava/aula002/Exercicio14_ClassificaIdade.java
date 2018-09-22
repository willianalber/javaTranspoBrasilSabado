package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio14_ClassificaIdade {
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe uma idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		
		teclado.close();
		
		if (idade >= 18){
			System.out.println("Categoria adulto!");
		}
		else if (idade >= 14){
			System.out.println("Categoria juvenil!");
		}
		else if (idade >= 12){
			System.out.println("Categoria infanto juvenil!");
		}
		else if (idade >= 9){
			System.out.println("Categoria infantil!");
		}
		else
		{
			System.out.println("Categoria mirim!");
		}
	}

}
