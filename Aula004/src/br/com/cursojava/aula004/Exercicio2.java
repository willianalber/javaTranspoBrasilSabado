package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String codigo = "";

		do {
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download arquivo");
			System.out.println("D - Upload arquivo");
			System.out.println("S - Sair");

			codigo = teclado.nextLine().toUpperCase();
			
			switch (codigo) {
			case "A":
				System.out.println("Você escolheu abrir arquivo");
				break;
			case "B":
				System.out.println("Você escolheu procurar arquivo");
				break;
			case "C":
				System.out.println("Você escolheu download arquivo");
				break;
			case "D":
				System.out.println("Você escolheu Upload arquivo");
				break;
			case "S":
				System.out.println("Você escolheu sair");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
			
			

		} while (!codigo.equalsIgnoreCase("S"));

		System.out.println("Fim da aplicação!!!");

		teclado.close();

	}

}
