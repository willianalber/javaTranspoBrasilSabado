package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio4_Peso {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		double peso = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite a sua altura: ");
		double altura = Double.parseDouble(teclado.nextLine());
		
		teclado.close();
		
		double imc = peso / (altura*altura);
		
		System.out.println("IMC = "+imc);

	}

}
