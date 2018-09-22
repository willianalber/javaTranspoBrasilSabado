package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio8_MaiorMenorNota {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		double n1 = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite a nota 2: ");
		double n2 = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite a nota 3: ");
		double n3 = Double.parseDouble(leitor.nextLine());
		
		leitor.close();
		
		double maior = Math.max(n1, Math.max(n2, n3));
		double menor = Math.min(n1, Math.min(n2, n3));
		System.out.println("Nota maior: "+maior+"\nNota menor: "+menor);
		
	}

}
