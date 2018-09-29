package br.com.cursojava.aula003;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um inteiro");
		int dia = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Numero invalido");
			break;
		}
	}

}
