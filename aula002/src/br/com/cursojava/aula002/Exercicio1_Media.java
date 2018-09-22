package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio1_Media {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		double n1 = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite a nota 2: ");
		double n2 = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite a nota 3: ");
		double n3 = Double.parseDouble(leitor.nextLine());
		
		leitor.close();
		
		double media = (n1+n2+n3)/3;
		
		System.out.println("Média: "+media);
		
	}

}
